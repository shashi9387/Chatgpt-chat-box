package com.springboot.chatgpt.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class OpenAIConfiguration {

    @Value("${openai.api.url}")
    private String chatUrl;

    @Bean
    public RestClient restClient(){

        return RestClient.builder()
                .baseUrl(chatUrl)
                .build();
    }
}
