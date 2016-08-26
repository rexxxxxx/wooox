package com.woox.univshop;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by swko on 2016-08-24.
 */

public class Task {
    private long id;
    private String text;

    public Task(long id, String text){
        this.id = id;
        this.text = text;
    }

    public interface PostTest{
        @POST("/task")
        Call<Task> createTask(@Body Task task);
    }

}
