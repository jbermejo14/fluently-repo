package com.project.fluently.api;


import com.project.fluently.domain.Topic;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TopicsApiInterface {

    @GET("topics")
    Call<List<Topic>> getTopics();
}
