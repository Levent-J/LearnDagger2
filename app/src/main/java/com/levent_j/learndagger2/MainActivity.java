package com.levent_j.learndagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Inject
    DaggerPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView) findViewById(R.id.tv_text);
        inject();
        presenter.showUserName();


    }

    private void inject() {
        DaggerActivityComponent.
                builder().
                activityModule(new ActivityModule(this))
                .build()
                .inject(this);
    }

    public void showUserName(String name) {
        textView.setText(name);
    }
}
