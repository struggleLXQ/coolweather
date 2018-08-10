package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    //利用@SerializedName注解方式让JSON字段和Java字段之间建立映射
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
