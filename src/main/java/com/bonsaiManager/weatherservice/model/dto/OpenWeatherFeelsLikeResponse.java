package com.bonsaiManager.weatherservice.model.dto;

import lombok.Data;

@Data
public class OpenWeatherFeelsLikeResponse {

    private double day;
    private double night;
    private double eve;
    private double morn;
}
