package ABSTRACTION;

public class BANKUSER2 {

	public static void main(String[] args) {
		RBI obj=null;
      String bank ="PNB";                                        //NON PRIMETATIVE DATA TYPE
		if (bank.equals("ICICI"))
		{
		
		obj=new ICICI();
		}else if (bank.equals("PNB"))
		{
		
		obj=new PNB();
		}else if(bank.equals("HDFC"))
		{
		obj=new HDFC();
		}
		obj.moneyTransfer();
		obj.internetbanking();
		obj.loan();
//runtime binding or runtime polymorphism
		//ref of parent class and object of child class
	}

}
