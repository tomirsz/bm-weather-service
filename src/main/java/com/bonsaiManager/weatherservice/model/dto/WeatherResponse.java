package com.bonsaiManager.weatherservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WeatherResponse {

    private double dayTemp;
    private double minTemp;
    private String description;
    private String icon;
}
