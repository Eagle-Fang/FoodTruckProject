package com.skilldistillery.foodtruck;

public class FoodTruck {

		private String truckName;
		private String foodType;
		private Double truckRating;
		private int TruckID;
		private static int nextTruckID;

	// contructor with no arguments

		public FoodTruck () {
		}
	// constructor with arguments
		public FoodTruck (String truckName, String foodType, Double truckRating) {
			this.truckName = truckName;
			this.foodType = foodType;
			this.truckRating = truckRating;
			FoodTruck.nextTruckID += 1;
			this.TruckID = FoodTruck.nextTruckID; 
			}

		public String getTruckName() {
			return truckName;
		}

		public void setTruckName(String truckName) {
				this.truckName = truckName;

		}

		public String getFoodType() {
			return foodType;
		}

		public void setFoodType(String foodType) {
			this.foodType = foodType;
		}

		public Double getTruckRating() {
			return truckRating;

		}

		public void setTruckRating(Double truckRating) {
			this.truckRating = truckRating;
		}

		
		public String toString() {

			String output = "Truck Name " + truckName + ", Food Type " + foodType
					+ ", Truck Rating " + truckRating + ", Truck ID " + TruckID; 	
			return output;

			}


	}
	
	
	

