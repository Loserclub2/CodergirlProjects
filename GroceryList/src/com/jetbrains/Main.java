package com.jetbrains;

import static java.lang. System.out;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);

		out.println("List three grocery items");
	    String groceryItem1;
		out.print("List Item1");
		groceryItem1 = keyboard.nextLine();

		String groceryItem2;
		out.print("List Item2");
		groceryItem2 = keyboard.nextLine();

		String groceryItem3;
		out.print("List Item3");
		groceryItem3 = keyboard.nextLine();


		int groceryCount;
		out.print("Enter the quanity " + groceryItem1 +  "");
		groceryCount = keyboard.nextInt();



		out.print("Enter the quanity " + groceryItem2 +  "");
		groceryCount = keyboard.nextInt();


		out.print("Enter the quanity " + groceryItem3 +  "");
		groceryCount = keyboard.nextInt();




		float groceryCost;
		out.print("Enter the price of " + groceryItem1 +  "");
		groceryCost = keyboard.nextFloat();

		out.print("Enter the price of " + groceryItem2 +  "");
		groceryCost = keyboard.nextFloat();


		out.print("Enter the price of " + groceryItem3 +  "");
		groceryCost = keyboard.nextFloat();





		float totalGroceryBillPrice = (groceryCount * groceryCost) ;
	    out.print("Calculating your grocery bill.");
	    out.print("Your total is " + totalGroceryBillPrice );




    }
}
