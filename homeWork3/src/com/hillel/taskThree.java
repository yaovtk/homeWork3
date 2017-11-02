package com.hillel;

public class taskThree {
    
    public static void main(String... args) {
        int a = Integer.parseInt(args[0]);
        if (a % 2 == 0) System.out.println("Число четное");
        else System.out.println("Число нечетное");
    }
}