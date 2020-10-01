package OopsConcepts;

public class CallByvalAndCalByref {
	int p;
	int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByvalAndCalByref obj = new CallByvalAndCalByref();
		//obj.testsum(20, 30);
		int x = 30;
		int y = 40;
		System.out.println(obj.testsum(x, y)); //call by value or pass by value
		obj.p =50;
		obj.q = 60;
		obj.swap(obj);
		
		System.out.println(obj.p );
		System.out.println(obj.q );
	}
	public int testsum(int a , int b)
	{
		a = 20;
		b = 30;
		int c = a+b;
		return c;
	}
	public void swap(CallByvalAndCalByref t)//call by reference
	{
	int temp;
	temp = t.p;
	 t.p = t.q;
	t.q = temp;
	}

}
