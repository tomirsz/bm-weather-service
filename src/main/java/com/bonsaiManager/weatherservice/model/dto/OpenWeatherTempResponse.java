package com.bonsaiManager.weatherservice.model.dto;

import lombok.Data;

@Data
public class OpenWeatherTempResponse {
    private double day;
    private double min;
    private double max;
    private double night;
    private double eve;
    private double morn;
}
