package Assignment;

class Engine {
    void engineInfo() {
        System.out.println("Engine is running");
    }
}

class Car {
    Engine e; // Car has an Engine

    Car(Engine e) {
        this.e = e;
    }

    void show() {
        e.engineInfo();
    }
}

public class agggregation20 {

	public static void main(String[] args) {
		

        Engine e1 = new Engine();
        
        Car c1 = new Car(e1);     

        c1.show();                
    }
}


