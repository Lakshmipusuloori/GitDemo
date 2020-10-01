package OopsconceptPart2;

public class Testbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		HSBCbank hs = new HSBCbank();
		hs.credit();
		hs.debit();
		hs.educationloan();
		hs.transfermoney();
		hs.mutualfund();
		USbank b= new HSBCbank();// child class object referred by parent Interface reference var
		b.credit();
		b.debit();
		b.transfermoney();
		System.out.println(USbank.min_bal);
		
	}

}
