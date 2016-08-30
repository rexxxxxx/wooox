package com.woox.univshop.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by swko on 2016-08-31.
 */
public class TokenResponse {

    @SerializedName("access_token")
    @Expose
    private String access_token;
    @SerializedName("num")
    @Expose
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }


}
