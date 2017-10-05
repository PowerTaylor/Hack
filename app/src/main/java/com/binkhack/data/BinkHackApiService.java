package com.binkhack.data;


import com.binkhack.model.User;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface BinkHackApiService {

//    @GET("/forecast")
//    void getWeatherInfo(@Query("lat") String latitude,
//                        @Query("lon") String longitude,
//                        @Query("cnt") String cnt,
//                        @Query("appid") String appid,
//                        Callback<Weather> cb);
//
//    @GET("/forecast/daily")
//    void getWeatherForcastDaily(@Query("lat") String latitude,
//                                @Query("lon") String longitude,
//                                @Query("cnt") String cnt,
//                                @Query("appid") String appid,
//                                Callback<Weather> cb);
//
//    @GET("weather")
//    Call<Weather> getWeather(@Path("main") String weather);

//    @GET("/user/1/")
//    Call<User> getUser(@QueryMap Map<String, String> options);

    @GET("/users/1/")
    Call<User> getUser();
}
