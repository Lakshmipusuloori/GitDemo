package Java;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println("********");
		System.out.println(i.length);
		System.out.println("*********");
		
		for(int j =0;j<i.length; j++)
		{
			System.out.println(i[j]);
		}

		double d[] = new double[2];
		d[0] = 12.12;
		d[1] = 10.12;
		System.out.println(d[1]);
		
		String s[] = new String[2];
		s[0] = "Lakshmi";
		s[1] = "Brinda";
		//s[3] = "Shailee";
		
		System.out.println(s.length);
		
		Object ob[] = new Object[3];
		ob[0] = 30;
		ob[1] = "Lakshmi";
		ob[2]= "2/2/2020";
		System.out.println(ob[2]);
		
		
		
	}

}
