package Annotations;

public class ControlStament {

	public static void main(String[] args) {
		//shopping Mall
		int purchase_amt=500,discount=0;
		if(purchase_amt >=5000)
			discount=20;
		else if(purchase_amt >=3000)
			discount=15;
		else if(purchase_amt >=2000)
			discount=10;
		else
			discount=5;
		
	System.out.println("Discount amount is:"+discount);
	}

}
