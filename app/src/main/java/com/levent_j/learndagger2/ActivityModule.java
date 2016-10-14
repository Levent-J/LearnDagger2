package com.levent_j.learndagger2;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by levent_j on 16-10-14.
 */
@Module
public class ActivityModule {
    private MainActivity activity;

    public ActivityModule(MainActivity activity){
        this.activity=activity;
    }

    @Provides
    public MainActivity provideActivity(){
        return activity;
    }

    @Provides
    public User provideUser(){
        return new User("new user from module");
    }

    @Provides
    public DaggerPresenter provideDaggerPresenter(MainActivity activity,User user){
        return new DaggerPresenter(activity,user);
    }
}
