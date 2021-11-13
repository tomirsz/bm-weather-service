package com.bonsaiManager.weatherservice.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class OpenWeatherResponse {

    private String lat;
    private String lon;
    private String timezone;
    private String timezone_offset;
    List<OpenWeatherDailyResponse> daily;
}
