package day2Objects;

public class Bat1 {
	public static void main(String[]args) {
	Bat bat1=new Bat();
	bat1.type="cricket bat";
	bat1.name="mrf";
	bat1.price=12000;
	System.out.println("type="+bat1.type+" ,name="+bat1.name+" ,price="+bat1.price);
	
	Bat bat2=new Bat();
	bat2.type="tennis bat";
	bat2.name="mercury";
	bat2.price=1000;
	System.out.println("type="+bat2.type+" ,name="+bat2.name+" ,price="+bat2.price);
	
	Bat bat3=new Bat();
	bat3.type="hockey bat";
	bat3.name="adiddas";
	bat3.price=2500;
	System.out.println("type="+bat3.type+" ,name="+bat3.name+" ,price="+bat3.price);
	}
}

