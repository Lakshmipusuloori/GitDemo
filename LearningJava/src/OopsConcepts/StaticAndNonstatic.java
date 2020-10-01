package OopsConcepts;

public class StaticAndNonstatic {
	String name = "Lakshmi";
	static int age = 30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//sum();
		StaticAndNonstatic.sum();
		System.out.println(age);
		StaticAndNonstatic obj = new StaticAndNonstatic();
		obj.sendmail();
	}
	
	public void sendmail()
	{
	System.out.println("send mail method");	
	}
	public static void sum()
	{
		System.out.println("Sum method");
	}

}
