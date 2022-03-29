import java.text.NumberFormat;

public class PersonalAcct extends Account

{
	public double balance;
	private final int W = 2;
	
	

	public PersonalAcct (double bal, String fName, String lName, String str, String city, String st, String zip) {
	super(bal,  fName, lName, str,  city,  st,  zip);
	}
	

	public double getBalance()
	{
		return(balance);
	}
	
	public void withdraw(double x)
	{
		if(balance >= x)
		{
			if(x >100)
			{
				balance = balance - x;
			}
			else
			{
				balance = balance -x -W;
			}
	}
	}
	
	public void deposit(double added)
	{
		balance = balance + added;
	}
	
	public String toString()
	
	{
		NumberFormat money = NumberFormat.getInstance();
		return("You have $" + money.format(balance) + " in your account");
	}
}