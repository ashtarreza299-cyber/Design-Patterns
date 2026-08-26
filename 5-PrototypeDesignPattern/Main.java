package org.example;

public class Main {

    public static void main(String[] args) {


        Address add1 = new Address("New York", new Country("US"));
        Person p1 = new Person("John", add1);
        Person p2 = p1.deepCopy();

        p2.address.city = "London";
        p2.address.country = new Country("UK");

        System.out.println(p1.address.city + " - " + p1.address.country.country);
        System.out.println(p2.address.city + " - " + p2.address.country.country);
    }

}