
abstract class Vehicle {
	private int topSpeed;
	private double engineSize;
	private int bodyType;


	public Vehicle(int tS, double eS, int bT) {
		topSpeed = tS;
		
		engineSize = eS;
		bodyType = bT;
	}
	


	 public int tS() {
	 	return(topSpeed);
	 }



	 public double eS() {
	 	return(engineSize);
	 }


	 
	 public int bT() {
	 	return(bodyType);
	 }


	
	abstract String bTContainer();
	
	
	
	abstract String description();
}
