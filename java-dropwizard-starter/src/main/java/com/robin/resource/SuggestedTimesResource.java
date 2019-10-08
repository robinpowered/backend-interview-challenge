/*
 * Robin API
 *
 * @copyright 2019 Robin Powered, Inc.
 * @link https://robinpowered.com/
 */
package com.robin.resource;

import com.robin.pojo.SuggestedTime;
import com.robin.service.SuggestedTimesService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.List;

/**
 * The suggested times resource. Feel free to add/remove functions/variables.
 */
@Path("/suggested-times")
@Produces(MediaType.APPLICATION_JSON)
public class SuggestedTimesResource {
    private SuggestedTimesService suggestedTimesService;

    public SuggestedTimesResource(SuggestedTimesService suggestedTimesService) {
        this.suggestedTimesService = suggestedTimesService;
    }

    /**
     * Gets all suggested times between users.
     *
     * @return the all times
     */
    @GET
    public List<SuggestedTime> getSuggestedEvents() {
        // TODO implement your logic here

        return suggestedTimesService.getSuggestedTimes();
    }
}
