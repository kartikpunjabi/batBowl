package com.batbowl.core.serviceProvider;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by kartikpunjabi on 12/4/16.
 */
public class RestHttpClient {
    private RestTemplate restTemplate;
    private final String APIKEY = "";

    public RestHttpClient(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }


    public ResponseEntity<String> getClientResponse(String http) {
        HttpHeaders httpHeader = new HttpHeaders();
        httpHeader.set("apikey", APIKEY);
        HttpEntity httpEnttity = new HttpEntity(httpHeader);
        ResponseEntity<String> responseEntity = null;
        try {
            responseEntity = restTemplate.exchange(http, HttpMethod.GET, httpEnttity, String.class);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        return responseEntity;
    }
}
