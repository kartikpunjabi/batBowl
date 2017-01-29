package com.batbowl.core.controller;

import com.batbowl.core.serviceProvider.RestHttpClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * Created by kartikpunjabi on 11/24/16.
 */
@RestController
public class Score {

    @RequestMapping(value="/getScore", method = RequestMethod.GET)
    public String getScore(){
        return "Score";
    }
}
