package OopsconceptPart2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BMW b = new BMW();//Static polymorphism--compile time polymorphism
b.start();
b.stop();
b.theft();
b.refuel();
b.engine();
System.out.println("-----");

Car c = new Car();
c.start();
c.stop();
c.refuel();
System.out.println("-------");
Car c1 = new BMW();//dynamic polymorphism
	
c1.start();
c1.stop();
c1.refuel();

	}

}
