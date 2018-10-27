package com.company;

import java.util.Random;

public class Dicer {
    private  int diceNo;
    public Dicer(int diceNo){
        this.diceNo = diceNo;
    }
    public  void throwDices(){
        Random random = new Random();

        StringBuilder stringbuilder = new StringBuilder("{");

        for (int i=0; i<diceNo; i++){
            stringbuilder.append(random.nextInt(6)+1).append(",");
        }
        stringbuilder.delete(stringbuilder.lastIndexOf(","),stringbuilder.length());
        stringbuilder.append("{"); //dodawanie napisów
        System.out.println(stringbuilder.toString());
    }
    public static void main(String[] args){
        new Dicer(1).throwDices();
        new Dicer(2).throwDices();
        new Dicer(3).throwDices();
    }
}
