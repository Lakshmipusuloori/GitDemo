package OopsConcepts;

public class Car {
	int model;
	int wheel;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car a = new Car(); //a,b,c are object references
Car b = new Car();
Car c = new Car();
a.model = 2014;
a.wheel = 4;
System.out.println(a.model);
a = b;
b = c;
c = a;
a.model = 30;
c.model = 40;
System.out.println(a.model);
System.out.println(c.model);
	}

}
