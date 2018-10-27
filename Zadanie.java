package com.company;

import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        //podzielnosc przez 2
        //int a = 1;
        /*if (a >0 && a<5) {
            System.out.println("hurra!");
        } else if (a>5 && a<10) {
            System.out.println("wow");
        } else
    {
      */
        //zamiast if-else - switch - instrukcja wyboru - jesli a pasuje do wzorca z case 1 to wyswietli, jesli nie pasuje zaden - default
        //break - wazny, inaczej wszystkie casy pokolei bylyby wykonane
        /*switch (a){
            case 1:
        System.out.println("1");
        break;
            case 2:
            System.out.println("2");
            break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("9");
            }*/
        //while dziala dopoki warunek jest prawdziwy!!! - wazne, zeby wyjsc z petli a++
       /* int a=0;
        {
        } while (a<10){
            System.out.println(a);
            a++;
        }*/

       //wczytane danych od uzytkownika
       /*System.out.print("daj liczbe");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        System.out.print("wybrałeś" + liczba);*/
//moj program
       /*System.out.println("podaj pierwsza liczbe");
       Scanner scanner = new Scanner(System.in);  //scanner tylko raz - jak biblioteka
       int liczba1 = scanner.nextInt();   //zeby wypisac na konsoli polecenie

        System.out.println("podaj drugą liczbe");

        int liczba2 = scanner.nextInt();
        if (liczba2==0){
            System.out.println("podaj inną liczbę, nie dziel przez 0");
        }else {
            System.out.println("wynik" + liczba1/(double)liczba2);
        }*/

       //petla for przed petla; petla; po kazdym cyklu i++
       String[] tablica = {"Monika", "Ola", "Ala"};
       int sum=0;
       //tablica.length - cecha tablicy, tablica.length() to zachowanie stringa - po zachowaniach są nawiasy!!!
       for(int i = 0; i<tablica.length; i++){
           System.out.println(tablica[i].toLowerCase());
           System.out.println(tablica[i].length());
           sum += tablica[i].length(); //+= zamiast sum=sum+
       }
       System.out.println(sum);

        }
    }





