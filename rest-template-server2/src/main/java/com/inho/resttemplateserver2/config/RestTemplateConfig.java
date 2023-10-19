package com.inho.resttemplateserver2.config;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
//    @Bean
//    public RestTemplate restTemplate() {
//        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
//
//        HttpClient client = HttpClientBuilder.create()
//                .setMaxConnTotal(500)
//                .setMaxConnPerRoute(500)
//                .build();
//        CloseableHttpClient httpClient = HttpClients.custom()
//                .setMaxConnTotal(500)
//                .setMaxConnPerRoute(500)
//                .build();
//
//        factory.setHttpClient(client);
//        factory.setConnectTimeout(2000);
//
//        RestTemplate restTemplate = new RestTemplate(factory);
//
//        return restTemplate;
//    }
}
