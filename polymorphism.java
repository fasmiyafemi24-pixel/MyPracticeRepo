package Assignment;

class shape {
	void area() {
		System.out.println("Area of triangle:lenght*breadth");
	}
}
	class rectangle extends shape{
		void area() {
			System.out.println("Area of rectangle:lenght*breadth");	
			
		}
	}

class circle extends shape{
	void area(){
		System.out.println("Area of circle:3.14*r*r");
	}
}
public class polymorphism {

	public static void main(String[] args) {
		shape obj =new rectangle();
		obj.area();
		shape obj2=new circle();
		obj2.area();
	}

}
