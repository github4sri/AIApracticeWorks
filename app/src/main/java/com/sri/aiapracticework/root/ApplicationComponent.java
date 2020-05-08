package com.sri.aiapracticework.root;

import com.sri.aiapracticework.http.ApiModuleForInfo;
import com.sri.aiapracticework.http.ApiModuleForName;
import com.sri.aiapracticework.topmovies.TopMoviesActivity;
import com.sri.aiapracticework.topmovies.TopMoviesModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, ApiModuleForName.class, ApiModuleForInfo.class, TopMoviesModule.class})
public interface ApplicationComponent {

    void inject(TopMoviesActivity target);

}
