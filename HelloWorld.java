package com.company;

public class HelloWorld {
    public static void main(String[] args){
        //static - wspolne dla wszystkich obiektow ktore tworzymy
        int i; //definiowanie zmiennej i przechowywanie malej liczby calk
        i=9;
        long ageOFuniverse = 25198453219813L;
        //definicja dlugosci liczby - zL na koncu - do przechowania duzej liczby calk,
        float c=8.9f;
        double b=8.9;
        //float - zmienna przecinkowa, double - wieksza liczba przecinkowa - ma wiecej pamieci, pozwoli zapisac zmienna;
        char a='a';
        boolean isJavaFUn=true;

        int d,f;
        d=9;
        f=5;
        double g=d/(double)f;
        //rzutowanie - przy dzieleniu int/int, trzeba jedną double
        //zlozone typy zmiennych string (zbior char)
        String name = "Ola";
        //tablice[] - przechowanie ilku typow zmiennych
        int[] tablica = {1, 2, 3};
        double[] tablica1 = new double[10]; //tablica typu double bedzie miala 10 elementow
        tablica1[0] = 0.9;
        //liczymy od 0
        int [][] h = new int[3][];
        h[0]=new int[5];
        h[1]=new int [3];
        h[2]=new int [2];
        h[1][0]=1; //dodajemy pierszy element =1
        //println(d++)/(d--) wyrzuci 9, wartosc zm d, dopiero potem zwiększy przy poworzeniu println(d)
        //operatory logiczne !() zaprzeczy calemu wyrazeniu w nawiasie



        System.out.println(!(b<a||false));


    }



}
