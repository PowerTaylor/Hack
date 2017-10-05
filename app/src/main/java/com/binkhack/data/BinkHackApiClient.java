package com.binkhack.data;

import com.binkhack.model.User;

/*
 * Created by ptaylor on 27/09/2017.
 */

public interface BinkHackApiClient {

    User getUser() throws Exception;
}
