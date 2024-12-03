package br.com.flavia.apppessoafisicav5.api;

import java.util.ArrayList;

import br.com.flavia.apppessoafisicav5.model.Posts;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("posts")
    Call<ArrayList<Posts>> getPosts();
}
