package com.hillel;

public class taskTwo {
    
    public static void main(String... args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int min = a;
        int max = a;
        
        if (b < min) min = b;
        if (c < min) min = c;
        System.out.println("Minimum is: " + min);
        
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println("Maximum is: " + max);
    }
}