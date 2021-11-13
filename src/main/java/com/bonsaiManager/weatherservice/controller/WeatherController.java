package com.bonsaiManager.weatherservice.controller;

import com.bonsaiManager.weatherservice.model.dto.WeatherResponse;
import com.bonsaiManager.weatherservice.service.WeatherService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/get-weather")
    public Mono<ResponseEntity<WeatherResponse>> getWeatger(@RequestParam String lat,
                                                            @RequestParam String lon) {
        return weatherService.getWeather(lat, lon)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.badRequest().build());
    }
}
