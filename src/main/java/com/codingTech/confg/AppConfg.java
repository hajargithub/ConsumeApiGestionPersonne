package com.codingTech.confg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
public class AppConfg {
	@Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
