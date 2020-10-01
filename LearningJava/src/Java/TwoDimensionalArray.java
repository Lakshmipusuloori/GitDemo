package Java;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s[][] = new String[3][5];
System.out.println(s.length);//total no of rows
System.out.println(s[0].length); // total no of columns
s[0][1] = "B";
for(int row = 0; row<s.length; row++)
{
	for(int col = 0; col<s[0].length; col++)
	{
		System.out.println(s[row][col]);
	}
}
	}

}
