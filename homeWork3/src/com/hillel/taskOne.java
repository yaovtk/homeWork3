package com.hillel;

public class taskOne {
	
	public static void main(String... args){
		int a = Integer.parseInt(args[0]), b = Integer.parseInt(args[1]), c = Integer.parseInt(args[2]), min = a;
        
        if (b < min) min = b;
        if (c < min) min = c;
        System.out.println("Minimum is: " + min);
        
	}
}