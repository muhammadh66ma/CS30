
import java.text.NumberFormat;

public class BusinessAcct extends Account

{
	public double balance;
	private final int W = 10;
	public BusinessAcct(String f, String l, double b)

	{

	super(fName, lName);
	balance =b;
	
	}
	public double getBalance()
	{
		return(balance);
	}
	
	public void withdraw(double x)
	{
		if(balance >= x)
		{
			if(x >500)
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