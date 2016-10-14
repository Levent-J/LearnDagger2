package com.levent_j.learndagger2;

import dagger.Component;

/**
 * Created by levent_j on 16-10-14.
 */
@Component(modules = ActivityModule.class)
public interface ActivityComponent{
    void inject(MainActivity activity);
}
