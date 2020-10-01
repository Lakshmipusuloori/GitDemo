package OopsconceptPart2;

public class Jeep {
String name;
int price;
String engine;
public Jeep(String name, int price, String engine)
{
	this.name = name;
	this.price = price;
	this.engine = engine;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Jeep obj1 = new Jeep("Toyota", 30, "Auto");
System.out.println(obj1.name);
System.out.println(obj1.price);
System.out.println(obj1.engine);
	}

}
