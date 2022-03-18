abstract class Vehicle {
	private int fuelEconomyCity, fuelEconomyHwy;
	private int seatingCapacity;
	private double cargoVolume;

	
	public Vehicle(int fECity, int fEHwy, int seating, double cargo) {
		fuelEconomyCity = fECity;
		fuelEconomyHwy = fEHwy;
		seatingCapacity = seating;
		cargoVolume = cargo;
	}
	
		

	 public int getFEHwy() {
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