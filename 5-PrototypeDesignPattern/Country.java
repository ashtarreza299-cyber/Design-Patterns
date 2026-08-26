package org.example;

public class Country{

    String country;

    public Country(String country) {
        this.country = country;
    }

    public Country deepCopy() {
        return new Country(country);
    }
}
