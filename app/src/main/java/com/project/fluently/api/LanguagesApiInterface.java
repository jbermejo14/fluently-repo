package com.project.fluently.api;

import com.project.fluently.domain.Language;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface LanguagesApiInterface {

    @GET("languages")
    Call<List<Language>> getLanguages();
}
