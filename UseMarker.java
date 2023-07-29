package day2Objects;

public class UseMarker {
public static void main(String[]args) {
	Marker marker1=new Marker();
	marker1.brand="camlin";
	marker1.price=50;
	marker1.color="black";
	marker1.isItPermanent=false;
	System.out.println("brand="+marker1.brand+",price="+marker1.price+"color="+marker1.color+" ,is it permanent="+marker1.isItPermanent);
	

Marker marker2=new Marker();
marker2.brand="reynolds";
marker2.price=100;
marker2.color="white";
marker2.isItPermanent=false;
System.out.println("brand="+marker2.brand+" ,price="+marker2.price+" ,color="+marker2.color+", is it permanent "+marker2.isItPermanent);
}
}
