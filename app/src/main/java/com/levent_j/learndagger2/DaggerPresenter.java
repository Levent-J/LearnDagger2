package com.levent_j.learndagger2;

/**
 * Created by levent_j on 16-10-14.
 */
public class DaggerPresenter {
    MainActivity activity;
    User user;

    public DaggerPresenter(MainActivity activity,User user){
        this.user=user;
        this.activity=activity;
    }

    public void showUserName(){
        activity.showUserName(user.name);
    }
}
