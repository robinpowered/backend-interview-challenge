/*
 * Robin API
 *
 * @copyright 2019 Robin Powered, Inc.
 * @link https://robinpowered.com/
 */
package com.robin.pojo;

import java.time.LocalDateTime;
import java.util.TimeZone;

/**
 * This class represents a suggested time for users to meet. Feel free to change/rename the fields
 * and add/delete functions.
 */
public class SuggestedTime {

    private LocalDateTime start;
    private LocalDateTime end;
    private int numberOfUsers;

    /**
     * Gets start.
     *
     * @return the start
     */
    public LocalDateTime getStart() {
        return start;
    }

    /**
     * Sets start.
     *
     * @param start the start
     */
    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    /**
     * Gets end.
     *
     * @return the end
     */
    public LocalDateTime getEnd() {
        return end;
    }

    /**
     * Sets end.
     *
     * @param end the end
     */
    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    /**
     * Gets number of users who are available during this time period.
     *
     * @return the number of users
     */
    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    /**
     * Sets number of users who are available during this time period.
     *
     * @param numberOfUsers the number of users
     */
    public void setNumberOfUsers(int numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }
}
