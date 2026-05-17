package Assignment;

class Vehicle
{
	void fueltype() {
		System.out.println("Runs on fuel");
	}
}

class ElectricCar extends Vehicle {
	void fueltype() {
		System.out.println("Runs on electicity");
		
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Vehicle obj=new Vehicle();
		obj.fueltype();
		
		ElectricCar obj2=new ElectricCar();
		obj2.fueltype();

	}

}
