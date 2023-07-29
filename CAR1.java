package day2Objects;

public class CAR1 {
	public static void main(String[]args) {
		Car car1=new Car();
		car1.company="tata";
		car1.price=800000;
		car1.taxPercent=10;
		car1.discountPercent=20;
		car1.taxAmount=car1.price*car1.taxPercent/100;
		car1.discountAmount=car1.price*car1.discountPercent/100;
		car1.netPrice=car1.price+car1.taxAmount-car1.discountAmount;
		System.out.println("company="+car1.company+" ,price="+car1.price+" ,netprice="+car1.netPrice);
		
		
	}

}
