package day2Objects;

public class Bike1 {
	public static void main(String[]args) {
		Bike bike1=new Bike();
		bike1.company="royal enfield";
		bike1.price=250000;
		bike1.taxAmount=20000;
		bike1.discountAmount=15000;
		bike1.netPrice=bike1.price+bike1.taxAmount-bike1.discountAmount;
		System.out.println("company="+bike1.company+" ,price="+bike1.price+" ,netprice="+bike1.netPrice);
		
		
	}

}
