package com.coderdream.hibernate3.model;

public class Person {
    private int id;
    private String name;
    private int age;
    private Address address;

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ";name=" + name + ";age=" + age + "]";
    }

    /**
     * @return the addressId
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param addressId
     *            the addressId to set
     */
    public void setAddress(Address address) {
        this.address = address;
    }

}