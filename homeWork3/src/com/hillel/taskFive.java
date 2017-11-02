package com.hillel;

public class taskFive {
    
    public static void main(String... args) {
        
        int firstNum = Integer.parseInt(args[0]), secondNum = Integer.parseInt(args[1]);
        int a = firstNum - 10;
        int b = secondNum - 10;
        
        if (a < 0) a *= -1;
        if (b < 0) b *= -1;
        
        if (a < b) System.out.println("Ближе к 10 - число: " + firstNum);
        else System.out.println("Ближе к 10 - число: " + secondNum);
    }
}