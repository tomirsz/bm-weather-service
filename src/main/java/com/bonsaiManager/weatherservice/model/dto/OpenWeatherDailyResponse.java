package com.bonsaiManager.weatherservice.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class OpenWeatherDailyResponse {
    private String dt;
    private String sunrise;
    private String sunset;
    private String moonrise;
    private String moonset;
    private String moon_phase;
    private OpenWeatherTempResponse temp;
    private OpenWeatherFeelsLikeResponse feels_like;
    private String pressure;
    private String humidity;
    private String dew_point;
    private String wind_speed;
    private String wind_deg;
    private String wind_gust;
    private List<OpenWeatherWeatherResponse> weather;
    private String clouds;
    private String pop;
    private String rain;
    private String uvi;
}
