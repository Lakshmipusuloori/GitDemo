package OopsConcepts;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
	}
public void sum()
{
	System.out.println("Sum method--No parameters");
}
public void sum(int i)
{
	System.out.println("Sum method with one param");
}
public void sum(int i, int j)
{
	System.out.println("Sum method with two params");
}
}
