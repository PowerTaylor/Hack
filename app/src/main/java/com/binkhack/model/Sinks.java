package com.binkhack.model;

import com.google.gson.annotations.SerializedName;

/*
 * Created by philltaylor on 29/09/2017.
 */

public class Sinks {

    @SerializedName("slug")
    public String slug;

    @SerializedName("description")
    public String description;

    @SerializedName("price")
    public int price;

    public String getSlug() {
        return slug;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}
