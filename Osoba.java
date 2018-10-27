package com.company;

public class Osoba {
    public Osoba(String name, String surname, Gender gender) {
        this.name = name;
        this.surname =surname;
        this.gender = gender;

    }

    String name;

    @Override
    public String toString() {
        return "Osoba{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
    @Override
    public boolean equals(Object other){
        Osoba otherOsoba=(Osoba) other;
        return this.name.equals(otherOsoba.name)&& this.surname.equals(otherOsoba.surname)&&this.gender==otherOsoba.gender;}



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    String surname;
    int age;
    private Gender gender;




}
