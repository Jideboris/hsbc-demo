package com.hsbc.server;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hsbc.server.model.CityData;

@RestController
public class CitiesController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Spring Boot API!";
    }

    @GetMapping("/api/cities/{letter}")
    @SuppressWarnings("CallToPrintStackTrace")
    public long getCitiesNumber(@PathVariable String letter) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            InputStream filePath = getClass().getResourceAsStream("/data/source.json");
            Map<String, Object> data = mapper.readValue(filePath, Map.class);

            var lists = data.get("list");
            List<CityData> dataList = mapper.convertValue(lists, new TypeReference<List<CityData>>() {
            });

            var dataItems = dataList.stream()
                    .filter(item -> item.name.toLowerCase().startsWith(letter.toLowerCase()))
                    .count();

            return dataItems;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;
    }

}
