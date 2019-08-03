package Exceptionhandling;

/*This program tries to add user defined exception.
 * When withdrawl amount is greater than available balance
 * then system will throw user defined exception. 
 */

class LowBalanceException extends Exception{
	public LowBalanceException(String message)
	{
		//System.out.println("Withdrawl amount is more than current balance");
		super(message);
	}
}
public class UserDefinedException {
	int Balance;
	public static void main(String[] args) {
		UserDefinedException customException= new UserDefinedException();
		customException.Balance = 5000;
		try
		{
			customException.withdrawMoney(10000);
		}
		catch(LowBalanceException e)
		{
			//e.printStackTrace();
			//System.out.println("mesage: "+e.getMessage());
			e.printStackTrace();
		}
	}
	public void withdrawMoney(int withdrawAmount) throws LowBalanceException
	{
		if(withdrawAmount > Balance)
		{
			throw new LowBalanceException("Low balance");
		}
		else
		{
			Balance = Balance-withdrawAmount;
		}
	}

}
