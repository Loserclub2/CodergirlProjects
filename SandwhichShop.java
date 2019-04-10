package com.jetbrains;

 import static java.lang.System. out;
 import java.util.Scanner;


public class SandwhichShop {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);


        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoups = 70;
        int totalCount = 550;

        out.println("Checking sales goals for today.");
        out.println("The sales goal for veggies sandwhiches is 50");
        out.println("How many veggies sandwhiches were sold?");
        goalForVeggies = keyboard.nextInt();

        if  (goalForVeggies >=50){
            out.println("Made goal");

        } else {

            out.println("Fell short");

        }

        out.println("The sales goal for burgers is 250");
        out.println("How many burgers were sold?");
        goalForBurgers = keyboard.nextInt();

        if (goalForBurgers >= 250) {
            out.println("Made goal");

        } else {

            out.println("Fell short");

        }
            out.println("The sales goal for sub sandwiches is 180");
            out.println("How many sub sandwhiches were sold?");
            goalForSubs = keyboard.nextInt();


            if (goalForSubs >= 180) {
                out.println("Made goal");

            } else {

                out.println("Fell short");

            }

        out.println("The sales goal for soup is 70");
        out.println("How many soups were sold?");
        goalForSoups = keyboard.nextInt();

        if (goalForSoups >= 70) {
            out.println("Made goal");

        } else {

            out.println("Fell short");

        }


















        }

    }
