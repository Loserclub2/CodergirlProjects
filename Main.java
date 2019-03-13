package com.jetbrains;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;

        System.out.println("Welcome to Multiplication Tables");
        System.out.println("Enter a number between 1 and 20");
        Scanner keyboard = new Scanner(System.in);

        a = keyboard.nextInt();
        b = 20 - a;


        for (c = a; c <=b; c++) {
            System.out.println("multiplication is" + c);


            for (d = 0; d <= a; d++) {
                System.out.println(c + "*" + d + " = " + (c * d));
            }
        }
    }
}





