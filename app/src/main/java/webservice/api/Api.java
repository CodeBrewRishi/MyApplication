package webservice.api;

import com.example.code_brew.myapplication.WeatherResponce;


import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by code-brew on 11/7/15.
 */
public interface Api {

    @GET("/Weather")
    void getWeather(@Query("q") String cityName, Callback<WeatherResponce> callback);
}
