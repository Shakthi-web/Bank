package day2Objects;

public class Calculator {
	public void add() {
int a=100;
int b=200;
System.out.println("addition="+(a+b));
}

	public void subtract(int a,int b) {
		System.out.println("subtraction="+(a-b));
		}
	public String multiply() {
		int num1=10;
		int num2=20;
		return "multiplication="+(num1*num2);
		}
	public String divide(int num1,int num2) {
		return "divide="+(num1/num2);
	}
}
	