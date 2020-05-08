package com.sri.aiapracticework.topmovies;


public class ViewModel {

    private String country;
    private String name;

    ViewModel(String name, String country) {
        this.country = country;
        this.name = name;
    }

    String getCountry() {
        return country;
    }

    void setCountry(String country) {
        this.country = country;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
