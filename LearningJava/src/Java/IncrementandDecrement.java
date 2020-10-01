package Java;

public class IncrementandDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i =1;
int j = i++;
//j = i = i+1--post increment
{
	System.out.println(j);
	System.out.println(i);
}
int k =1;
int l = ++k;
//pre increment
{
	System.out.println(k);
	System.out.println(l);
}
	}

}
