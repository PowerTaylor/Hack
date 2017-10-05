package com.binkhack.model;

import com.google.gson.annotations.SerializedName;

/*
 * Created by philltaylor on 29/09/2017.
 */

public class Sources {

    @SerializedName("slug")
    public String slug;

    @SerializedName("description")
    public String description;

    @SerializedName("value")
    public String value;

    public String getSlug() {
        return slug;
    }

    public String getDescription() {
        return description;
    }

    public String getValue() {
        return value;
    }
}
