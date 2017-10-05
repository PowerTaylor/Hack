package com.binkhack.model;

import com.google.gson.annotations.SerializedName;


public class Transaction {

//    @SerializedName("timestamp")
//    public;

    @SerializedName("type")
    public String type;

    @SerializedName("item_id")
    public int itemId;

    @SerializedName("user_id")
    public int userId;

    public String getType() {
        return type;
    }

    public int getItemId() {
        return itemId;
    }

    public int getUserId() {
        return userId;
    }
}
