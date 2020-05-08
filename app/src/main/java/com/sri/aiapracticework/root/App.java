package com.sri.aiapracticework.root;

import android.app.Application;

import com.sri.aiapracticework.http.ApiModuleForInfo;
import com.sri.aiapracticework.http.ApiModuleForName;
import com.sri.aiapracticework.topmovies.TopMoviesModule;

public class App extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .apiModuleForName(new ApiModuleForName())
                .topMoviesModule(new TopMoviesModule())
                .apiModuleForInfo(new ApiModuleForInfo())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
