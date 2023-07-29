package day2Objects;

public class Ac1 {
	public static void main(String[]args) {
		Ac ac1=new Ac();
		ac1.company="croma";
		ac1.price=35000;
		ac1.taxPercent=10;
		ac1.discountPercent=20;
		ac1.taxAmount=ac1.price*ac1.taxPercent/100;
		ac1.discountAmount=ac1.price*ac1.discountPercent/100;
		ac1.netPrice=ac1.price+ac1.taxAmount-ac1.discountAmount;
		System.out.println("company="+ac1.company+" ,price="+ac1.price+" ,netprice="+ac1.netPrice);
		
		
	}

}
