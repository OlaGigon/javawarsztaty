package com.company;

public class Dog {
    public int getNumberOflegs() {
        return numberOflegs;
    }

    //nadajemy pola - przepis na stworzenie psa - metoda/funkcja
    String name;

    public void setNumberOflegs(int numberOflegs) {
        this.numberOflegs = numberOflegs;
    }//void - pusta metoda - wiec trzeba jej cos podac zeby wyrzucic cos

    private int numberOflegs;
    //public - zeby zaczac tworzyc konstruktor, konstruktor nie tworzy obiektu, sluzy do inicjalizacji obiektu
    //tworzenie obiektu new...
    //konstruktor - do wrzucania wartosci do obiektu
    public Dog(){
        this.numberOflegs = 4;
    }
    public Dog(String name) {
        //odwolanie do istniejacego konstruktora numoflegs this() - wywolaj konstruktor bez parametrow - domyslny
        this();
        this.name = name;

    }

    public void bark(){
        System.out.println("hua hua");
    }

}
