package com.batbowl.core.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by kartikpunjabi on 1/28/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchList {
    public Match[] matches;
}
