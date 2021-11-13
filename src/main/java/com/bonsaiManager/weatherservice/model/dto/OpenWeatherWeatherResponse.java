package com.bonsaiManager.weatherservice.model.dto;

import lombok.Data;

@Data
public class OpenWeatherWeatherResponse {

    private long id;
    private String main;
    private String description;
    private String icon;
}
