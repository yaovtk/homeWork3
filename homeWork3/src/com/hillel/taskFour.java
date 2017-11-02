package com.hillel;

public class taskFour {
    
    public static void main(String... args) {
        int firstNum = Integer.parseInt(args[0]), secondNum = Integer.parseInt(args[1]);
        
        if (firstNum % secondNum == 0) System.out.println(firstNum + " делится на " + secondNum + " без остатка");
        else {
            int ostatok = firstNum % secondNum;
            System.out.println(firstNum + " делится на " + secondNum + " с остатком " + ostatok);
        }
    }
}