public class Hokey {

	public static void main(String[] args) 
	{
		
		Puck yPuck = new Puck(1.5, 1.0, 4.5);
		Puck sPuck = new Puck(2.0, 1.5, 5.5);
		

		
		
		if (yPuck.equals(sPuck)) // if the two pucks are equal then printing the pucks are equal
		{
			System.out.println("The pucks are equal.");
		}
		else 
		{
			System.out.println("The pucks are not equal.");
	
			
		}
		System.out.println(yPuck.toString());
	}

	
}

