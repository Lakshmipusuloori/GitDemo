package OopsConcepts;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Functions obj = new Functions();
obj.test();
int m = obj.pqr();
System.out.println(m);
String n = obj.qa();
System.out.println(n);
int x =obj.division(40,20 );
System.out.println(x);
	}

	public void test()
	{
	System.out.println("Test method");	
	}
	public int  pqr()
	{
		System.out.println("pqr method");
		int a= 10;
		int b = 30;
		int c = a+b;
		return c;
	}
	public String qa()
	{
		System.out.println("qa method");
		String s = "Selenium";
		return s;
	}
	public int division(int x, int y)
	{
		System.out.println("division method");
		int d = x/y;
				return d;
	}
}
