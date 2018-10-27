package com.company;

public class Main{
    public static void main(String[] args){
        Osoba monia = new Osoba("Monika", "Kowalska", Gender.FEMALE);
        Osoba monia1 = new Osoba("Monika", "Kowalska", Gender.FEMALE);
        //System.out.println(monia==monia1); //== dziala na referencjach, dlatego wynik da False

        System.out.println(monia.equals(monia1)); //tez porownuje po #code, nie po cechach

        /*System.out.println(monia);

        String a = new String("Java");
        String b = new String("Java");
        String c = "Java";
        String d = "Java";

        System.out.println(a==b);
        System.out.println(c==d); //== nie sluzy do porównywania obiektów

       /* for (int i=0; i<10000; i++){
            System.out.println("a"=="a");
        }*/


    }
}

   /* public static void main(String[] args) {

            Dog reksio = new Dog("Reksio");
            reksio.setNumberOflegs(3);
            //po co te get set - hermetyzacja - wszystkie pola powinny byc prywatne i dostep so nich przez getter, setter, zeby potem je modyfikowac
            System.out.println(reksio.getNumberOflegs());


            reksio.bark();
            }*/

    /*public static void main(String[] args){

        Osoba Ola = new Osoba("Ola Gigoń");
        System.out.println();
    }

}
*/