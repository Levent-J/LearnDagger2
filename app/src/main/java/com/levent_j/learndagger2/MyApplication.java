package com.levent_j.learndagger2;

import android.app.Application;

/**
 * Created by levent_j on 16-10-14.
 */
public class MyApplication extends Application{
    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .apiModule(new ApiModule())
                .build();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }
}
