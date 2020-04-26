package com.example.easychat.Fragments;

import com.example.easychat.Notifications.MyResponse;
import com.example.easychat.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers({
            "Conten-Type:application/json",
            "Authorization:key=AAAAh1DDR0E:APA91bFXgt_ez_qrJSEAGMnEgmi68sMXXEAFqAmUGPv_zzE7N3XqutAIhSSjqOf1K-6FDelIV1QqB8QzLx9NcpLAm7fG4kGTp8cJrffcLdaRpc24QKh_78obhdr857VciOw8tma1TFB9"
    })

    @POST ("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
