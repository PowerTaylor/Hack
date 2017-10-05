package com.binkhack.data;

import android.support.annotation.NonNull;

import com.binkhack.model.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*
 * Created by ptaylor on 26/09/2017.
 */

public class ApiClient implements BinkHackApiClient {

    private static final String BASE_URL = "http://52.166.72.99/";

    private Gson gson;
    private Retrofit retrofit;

    public ApiClient() {
        setupGson();
        setupRetrofit();
    }

    private void setupGson() {
        gson = new GsonBuilder().create();
    }

    private void setupRetrofit() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

//    @Override
//    public Weather getWeatherForCity(@NonNull String city) throws Exception {
//        BinkHackApiService service = retrofit.create(BinkHackApiService.class);
//
//        HashMap<String, String> options = new HashMap<>();
//        options.put("appid", APP_ID);
//        options.put("q", city);
//
//        return makeApiRequest(service.getWeatherDetails(options));
//    }

    @Override
    public User getUser() throws Exception {
        BinkHackApiService service = retrofit.create(BinkHackApiService.class);

        return makeApiRequest(service.getUser());
    }

    private <T> T makeApiRequest(@NonNull Call<T> call) throws Exception {
        Response<T> response = call.execute();
        if (response.isSuccessful()) {
            return response.body();
        } else {
            return null;
        }
    }
}
