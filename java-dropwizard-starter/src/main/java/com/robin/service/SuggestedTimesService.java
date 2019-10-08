/*
 * Robin API
 *
 * @copyright 2019 Robin Powered, Inc.
 * @link https://robinpowered.com/
 */
package com.robin.service;

import com.robin.pojo.SuggestedTime;

import java.util.Collections;
import java.util.List;

/**
 * The type suggested times service. Feel free to add/remove functions and variables.
 */
public class SuggestedTimesService {
    /**
     * Gets suggested times.
     *
     * @return the suggested times
     */
    public List<SuggestedTime> getSuggestedTimes() {
        // TODO implement your logic here
        return Collections.singletonList(new SuggestedTime());
    }
}
