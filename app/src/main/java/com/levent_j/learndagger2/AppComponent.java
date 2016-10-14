package com.levent_j.learndagger2;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by levent_j on 16-10-14.
 */
@Singleton
@Component(modules = {ApiModule.class})
public interface AppComponent {
    OkHttpClient getOkClient();
    Retrofit getRetrofit();
    User getUser();
}
