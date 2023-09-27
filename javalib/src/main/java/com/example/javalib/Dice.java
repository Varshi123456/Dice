package com.example.javalib;
import java.util.Random;
public class Dice {


    public static void main(String[] args) {

        System.out.println( roll(6));
    }
    public  static int roll(int n){
        Random rand = new Random();
        int rand_num =(int)rand.nextInt((n-1) + 1) +1;
        return rand_num;
    }
}