package Assignment;

class Calculator
{
	int add(int a,int b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
	

public class Overloading {

	public static void main(String[] args) {
		Calculator obj=new Calculator();
		
		int intResult=obj.add(10,20 );
		System.out.println("Integer addition result: "+intResult);
		double doubleResult=obj.add(10.5, 12.5);
		System.out.println("double addition result: "+doubleResult);
	}
		
		
	}


}
