package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		boolean keepgoing = true;

		String nameApp = "";
		String foodApp = "";
		double ratingApp = 0.0;
		int numTrucks = 0;


		FoodTruck[] truckArr = new FoodTruck[5];



		for (int i = 0; i < truckArr.length; i++) {

			System.out.println("Enter Name");
			nameApp = kb.nextLine();

			
			if (nameApp.equals("quit")) {
	
				break;
			}
	

			System.out.println("Enter Food Type");
			foodApp = kb.nextLine();
	
			System.out.println("Enter Rating");
			ratingApp = kb.nextDouble();
			kb.nextLine();

			truckArr[i] = new FoodTruck(nameApp, foodApp, ratingApp);

			numTrucks++;
		}

		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                        |");
		System.out.println("|   1. List Trucks       |");
		System.out.println("|   2. Average Rating    |");
		System.out.println("|   3. Highest Rating    |");
		System.out.println("|   4. Quit              |");
		System.out.println("|                        |");
		System.out.println("========================");

		while (keepgoing) {
			// runMenu();
			System.out.println("Please choose 1 - 4: ");
			int choice = kb.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Here is a list of trucks: ");
				for (int i = 0; i < truckArr.length; i++) {

					if (truckArr[i]!=(null)) {

						System.out.println(truckArr[i].toString());
					}

				}		
				break;
				
				
			case 2:
				double sum = 0;
				double average = 0;
				int numberItems = 0;
				for (int j = 0; j < truckArr.length; j++) {
					if (truckArr[j]!=null) {
						sum += truckArr[j].getTruckRating();
						average = sum / numTrucks;
						numberItems++;
					}

					average = sum / numberItems;
				}

				System.out.println(average);
				break; 
				
			case 3:
				int countR = 0;
				double maxR = truckArr[0].getTruckRating();
				for (int i = 0; i < truckArr.length; i++) {
					if (truckArr[i]!=null) {
						if (maxR < truckArr[i].getTruckRating()) {
							maxR = truckArr[i].getTruckRating();
							countR = i;
						}

					}
				}
				System.out.println("Highest rated food truck : " + truckArr[countR].toString());
				break;

			case 4:
				System.out.println("You've chosen to quit");
				keepgoing = false;
				break;

			default:
				System.out.println("That is not a valid choice.");
			}

		}

	}

}