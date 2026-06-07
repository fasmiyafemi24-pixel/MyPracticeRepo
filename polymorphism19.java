package Assignment;

class Camera
{
	void Capture()
	{
		System.out.println("capturing image using camera");
	}
}

class DSLCamera extends Camera
{
	void Capture()
	{
		System.out.println("capture image using DSLCamera ");
	}
}

public class polymorphism19 {

	public static void main(String[] args) {
		
		Camera obj=new DSLCamera();
		obj.Capture();
		

	}

}
