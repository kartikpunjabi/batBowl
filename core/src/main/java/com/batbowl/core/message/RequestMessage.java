package com.batbowl.core.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by kartikpunjabi on 1/28/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestMessage {
    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    private String apiKey;

    public RequestMessage(){

    }



}
