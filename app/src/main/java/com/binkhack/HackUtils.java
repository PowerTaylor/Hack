package com.binkhack;

import com.binkhack.model.User;

/**
 * Created by philltaylor on 29/09/2017.
 */

public class HackUtils {

    private static User user;

    public static void setUser(User userObj) {
        user = userObj;
    }

    public static User getUser() {
        return user;
    }
}
