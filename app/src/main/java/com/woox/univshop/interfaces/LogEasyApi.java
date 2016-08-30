package com.woox.univshop.interfaces;

import com.woox.univshop.models.TokenRequest;
import com.woox.univshop.models.TokenResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by swko on 2016-08-30.
 */
public interface LogEasyApi {

    @POST("oauth/access_token")
    Call<TokenResponse> getTokenAccess(@Body TokenRequest tokenRequest);
}
