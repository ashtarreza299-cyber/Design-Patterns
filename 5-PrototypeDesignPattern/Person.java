package org.example;

public class Person implements Prototype{

    String name;
    Address address;

    public Person(String name, Address address) {

        this.name = name;
        this.address = address;
    }

    @Override
    public Person deepCopy() {
        return new Person(name, address.deepCopy());
    }

}
