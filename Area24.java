package Assignment;

class Shape {

    int length = 6;

    void square() {
        int area = length * length;
        System.out.println("Area of Square = " + area);
    }

    void rectangle() {
        int breadth = 4;
        int area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }

    void circle() {
        double area = 3.14 * length * length;
        System.out.println("Area of Circle = " + area);
    }
}

public class Area24 {

	public static void main(String[] args) {
		
        Shape s = new Shape();

        s.square();
        s.rectangle();
        s.circle();
    }
}

