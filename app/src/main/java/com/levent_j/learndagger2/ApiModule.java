package com.levent_j.learndagger2;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by levent_j on 16-10-14.
 */
@Module
public class ApiModule {
    public static final String BASE_URL="http://www.baidu.com";

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient(){
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(60*1000, TimeUnit.MILLISECONDS)
                .readTimeout(60*1000,TimeUnit.MILLISECONDS)
                .build();
        return client;
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit(OkHttpClient client){
        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl(BASE_URL)
                .build();
        return retrofit;
    }

    @Provides
    @Singleton
    User provideUser(){
        return new User("new user from apiModeule");
    }
}

