package com.levent_j.learndagger2;

import dagger.Component;

/**
 * Created by levent_j on 16-10-14.
 */
@ActivityScope
@Component(modules = ActivityModule.class,dependencies = AppComponent.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
    //void inject(DaggerActivity daggerActivity)
}
