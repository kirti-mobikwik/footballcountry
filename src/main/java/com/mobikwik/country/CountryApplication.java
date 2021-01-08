package com.mobikwik.country;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mobikwik.country.model.Country;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableEurekaClient
public class CountryApplication {
    public static void main(String[] args) {
        SpringApplication.run(CountryApplication.class, args);
    }

}
