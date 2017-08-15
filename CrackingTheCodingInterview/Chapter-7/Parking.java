/*
	Design a parking lot using Object Oriented Principles.
*/

public class Parking{
	private static class Car{
		int licenseNumber;
		int spotNumber;

		// constructor
		Car(int licenseNumber){this.licenseNumber=licenseNumber;}

		void setSpotNumber(int spotNumber){this.spotNumber=spotNumber;}
	}

	// Fields for parking lot
	int capacity;
	int occupied;
	int available;
	int[] parkingArray;

	// constructor 
	Parking(int capacity){
		this.capacity = capacity;
		this.occupied=0;
		this.available=capacity;
		parkingArray = new int[capacity];
	}


	// Enter method
	void enter(Car car){
		if(available==0){
			System.out.println("*** Parking is FULL. ***");
			return ;
		}
		// find the next available spot
		int spotNumber = findSpot(parkingArray);
		// update the car's spot number
		car.setSpotNumber(spotNumber);
		// park the car
		parkingArray[spotNumber]=car.licenseNumber;
		// update stats
		this.available--;
		this.occupied++;
		// print message 
		System.out.println("The car with license number "+car.licenseNumber+" parked at spot "+spotNumber+".\n"+"Available spots: "+this.available+".\n"+"Occupied spots: "+this.occupied+".\n");
	}

	// find the next available parking spot
	int findSpot(int[] array){
		for(int i=0; i<array.length; i++){
			if(array[i]==0) return i;
		}
		System.out.println("ERROR");
		return -1;
	}



	// Exit method
	void exit(Car car){
		int spotNumber = car.spotNumber;
		parkingArray[spotNumber]=0;
		this.available++;
		this.occupied--;
		System.out.println("The car with license number "+car.licenseNumber+" exited the parking.\n"+"Available spots: "+this.available+".\n"+"Occupied spots: "+this.occupied+".\n");
	}


	public static void main(String[] args) {
		Parking parking = new Parking(4);
		Car car1 = new Car(1000);
		Car car2 = new Car(2000);
		Car car3 = new Car(3000);
		Car car4 = new Car(4000);
		Car car5 = new Car(5000);

		parking.enter(car1);
		parking.enter(car2);
		parking.enter(car3);

		//parking.exit(car2);
		parking.enter(car4);


		parking.enter(car5);
	}
}








