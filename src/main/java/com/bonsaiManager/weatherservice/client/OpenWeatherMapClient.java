package com.bonsaiManager.weatherservice.client;

import com.bonsaiManager.weatherservice.model.dto.OpenWeatherResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.DefaultUriBuilderFactory;
import reactor.core.publisher.Mono;


@Data
@AllArgsConstructor
public class OpenWeatherMapClient {

    private String url;
    private String apiKey;
    private WebClient webClient;

    public OpenWeatherMapClient(String url, String apiKey) {
        this.url = url;
        this.apiKey = apiKey;
        this.webClient = WebClient.builder().build();
    }

    public Mono<OpenWeatherResponse> getWeather(String lat, String lon) {
        return webClient.get()
                .uri(new DefaultUriBuilderFactory(url).builder()
                        .queryParam("lat", lat)
                        .queryParam("lon", lon)
                        .queryParam("appid", apiKey)
                        .build())
                .exchangeToMono(res -> {
                    if (res.statusCode().equals(HttpStatus.OK)) {
                        return res.bodyToMono(OpenWeatherResponse.class);
                    } else {
                        return Mono.empty();
                    }
                });
    }
}
