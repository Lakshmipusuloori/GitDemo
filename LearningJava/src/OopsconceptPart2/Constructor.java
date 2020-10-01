package OopsconceptPart2;

public class Constructor {

	String name;
	int age;
	public Constructor()
	{
		System.out.println("Default constructor");
	}
	public Constructor(int a)
	{
		System.out.println("1 parameter constructor");
		System.out.println(a);
	}
	public Constructor( String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constructor obj = new Constructor();
Constructor obj1 = new Constructor(20);
Constructor obj2 = new Constructor("Tom", 30);
System.out.println(obj2.name);
System.out.println(obj2.age);
	}

}
