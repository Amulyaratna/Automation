package ABSTRACTION;

public class BANKUSER {

	public static void main(String[] args)
	{RBI obj;                                          //NON PRIMETATIVE DATA TYPE
		obj=new HDFC();
		obj.moneyTransfer();
		obj.internetbanking();
		obj.loan();
		
		 obj=new ICICI();
		obj.moneyTransfer();
		obj.internetbanking();
		obj.loan();
		
		 obj=new PNB();
		obj.moneyTransfer();
		obj.internetbanking();
		obj.loan();
		
	}

}
