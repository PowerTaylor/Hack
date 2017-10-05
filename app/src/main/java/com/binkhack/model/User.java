package com.binkhack.model;

import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;



public class User {

    @SerializedName("first_name")
    public String firstName;

    @SerializedName("last_name")
    public String lastName;

    @SerializedName("email")
    public String email;

    @SerializedName("password")
    public String password;

    @SerializedName("points_balance")
    public int pointsBalance;

    @SerializedName("lifetime_balance")
    public int lifetimeBalance;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getPointsBalance() {
        return pointsBalance;
    }

    public int getLifetimeBalance() {
        return lifetimeBalance;
    }
}
