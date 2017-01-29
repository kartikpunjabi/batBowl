package com.batbowl.core.controller;

import com.batbowl.core.message.MatchList;
import com.batbowl.core.serviceProvider.RestHttpClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kartikpunjabi on 1/28/17.
 */
@RestController
public class Match {

    private static ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping(value="/getMatchList", method = RequestMethod.GET)
    public @ResponseBody MatchList getMatchList(){
        RestTemplate restTemplate = new RestTemplate();
        RestHttpClient restHttpClient = new RestHttpClient(restTemplate);
        ResponseEntity<String> responseEntity = restHttpClient.getClientResponse("http://cricapi.com/api/matches/");
        System.out.println(responseEntity.getBody());
        MatchList matchList = new MatchList();

        try {
            matchList = objectMapper.readValue(responseEntity.getBody(), MatchList.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return matchList;
    }
}
