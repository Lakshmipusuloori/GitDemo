package OopsConcepts;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String x = "100";
System.out.println(x+20);
int i = Integer.parseInt(x);
System.out.println(i+20);
int j = 200;
System.out.println(j+20);
String s = String.valueOf(j);
System.out.println(s+20);
String u = "100A";
Integer.parseInt(u);//Number format exception
	}

}
