abstract class Vehicle {
	private int topSpeed;
	private int seatingCapacity;
	private double cargoVolume;

	
	public Vehicle(int tSpeed, int seating, double cargo) {
		topSpeed = tSpeed;
		seatingCapacity = seating;
		cargoVolume = cargo;
	}
	
		

	 public int tSpeed () {
	 	return(fuelEconomyHwy);
	 }



	 public int getFECity() {
	 	return(fuelEconomyCity);
	 }


	
	 public int getSeating() {
	 	return(seatingCapacity);
	 }


	
	 public double getCargoVolume() {
	 	return(cargoVolume);
	 }



	abstract String cargoContainer();
	
	
	
	abstract String description();
}