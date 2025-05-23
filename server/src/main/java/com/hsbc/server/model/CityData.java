package com.hsbc.server.model;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CityData {

    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Map<String, Object> coord;

    public Map<String, Object> getCoord() {
        return coord;
    }

    public void setCoord(Map<String, Object> coord) {
        this.coord = coord;
    }

    public Map<String, Object> main;

    public Map<String, Object> getMain() {
        return main;
    }

    public void setMain(Map<String, Object> main) {
        this.main = main;
    }

    public List<Map<String, Object>> weather;

    public List<Map<String, Object>> getWeather() {
        return weather;
    }

    public void setWeather(List<Map<String, Object>> weather) {
        this.weather = weather;
    }
}
