package OopsConcepts;

public class LocalvsGlobalVariables {

	int age = 20;
	String name = "Lakshmi";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i = 10;
System.out.println(i);
LocalvsGlobalVariables obj = new LocalvsGlobalVariables();
System.out.println(obj.name);
System.out.println(obj.age);
//System.out.println(obj.sum());
int m = obj.sum();
System.out.println(m);


	}
	public int sum()
	{
		int i = 15;
		int j = 20;
		int age = i+j;
		return age;
	}

}
