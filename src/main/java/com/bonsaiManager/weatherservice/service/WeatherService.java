package com.bonsaiManager.weatherservice.service;

import com.bonsaiManager.weatherservice.client.OpenWeatherMapClient;
import com.bonsaiManager.weatherservice.model.dto.WeatherResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@Slf4j
@AllArgsConstructor
public class WeatherService {

    private final OpenWeatherMapClient weatherMapClient;

    public Mono<WeatherResponse> getWeather(String lat, String lon) {
       return weatherMapClient.getWeather(lat, lon)
               .map(r -> new WeatherResponse(
                       r.getDaily().get(0).getTemp().getDay(),
                       r.getDaily().get(0).getTemp().getMin(),
                       r.getDaily().get(0).getWeather().get(0).getDescription(),
                       r.getDaily().get(0).getWeather().get(0).getIcon()));
    }
}
