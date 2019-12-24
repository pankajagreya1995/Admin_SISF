package com.agreyasoft.admin_sisf.UTILS;

import com.agreyasoft.admin_sisf.POJO.Response_login;
import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface APIInterface {
    //This method is used for "POST"

    @FormUrlEncoded
    @POST("app/api/forgotPassword")
    Call<Response_login> forget_password(@FieldMap HashMap<String, String> data);

    @FormUrlEncoded
    @POST("app/api/changePassword")
    Call<Response_login> change_password(@FieldMap HashMap<String, String> data);

    @FormUrlEncoded
    @POST("app/api/registerStudent")
    Call<Response_login> register(@FieldMap HashMap<String, String> data);

    @FormUrlEncoded
    @POST("app/api/verifyAccount")
    Call<Response_login> verifyAccount(@FieldMap HashMap<String, String> data);

    @FormUrlEncoded
    @POST("app/api/submitAnswers")
    Call<Response_login> SubmitAnswer(@FieldMap HashMap<String, String> data);

    @FormUrlEncoded
    @POST("app/api/login")
    Call<Response_login> login(@FieldMap HashMap<String, String> data);

    @GET("app/api/subjectList")
    Call<Response_login> getSubject();

    @GET("app/api/chapterList")
    Call<Response_login> getChapter(@Query("subject_id") String subject_id);

    @GET("app/api/questionList?")
    Call<Response_login> getQuestions(@Query("chapter_id") String chapter_id);
}
