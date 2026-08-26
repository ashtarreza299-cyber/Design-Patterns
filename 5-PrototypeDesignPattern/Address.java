package org.example;

public class Address {

    String city;
    Country country;

    public Address(String city, Country country) {
        this.city = city;
        this.country = country;
    }

    public Address deepCopy() {
        return new Address(city, country.deepCopy());
    }
}
