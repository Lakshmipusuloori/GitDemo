package OopsconceptPart2;

public class HSBCbank implements USbank,Brazilbank { //multiple Inheritance, IS-a relationship

	public void credit()
	{
		System.out.println("HSBC--Credit");
	}
	public void debit()
	{
		System.out.println("HSBC----Debit");
	}
	public void transfermoney()
	{
	System.out.println("HSBC---transfermoney");	
	}
	public void educationloan()
	{
		System.out.println("HSBC---educationloan");
	}
	public void mutualfund()
	{
		System.out.println("Brazil---mutualfund");
	}
}
