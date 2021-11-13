package com.bonsaiManager.weatherservice.config;

import com.bonsaiManager.weatherservice.client.OpenWeatherMapClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenWeatherMapClientConfig {

    @Value("${open.weather.url}")
    private String url;
    @Value("${open.weather.key}")
    private String apiKey;

    @Bean
    public OpenWeatherMapClient getWeatherClient() {
        return new OpenWeatherMapClient(url, apiKey);
    }
}
