package com.project.fluently.api;

import com.project.fluently.domain.Language;

import java.util.List;

public interface LevelsApiInterface {


    @GET("levels")
    Call<List<Level>> getLevels();
}
