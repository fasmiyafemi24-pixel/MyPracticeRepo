package Assignment;

class School2
{
	String name;
	String address;
	int strength;
	
	School2(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	
	School2(String name,String address,int length)
	{
		this.name=name;
		this.address=address;
		this.strength=strength;
	}
	void display()
	{
		System.out.println("School name:" +name);
		System.out.println("School address:" +address);
		System.out.println("School strength:" +strength);
	}
}

public class school26 {

	public static void main(String[] args) {
		
		School2 obj=new School2("Delhi public school","kolkata");
		School2 obj1=new School2("Delhi public school","kolkata",1200);
		
		obj.display();
		obj1.display();
		
		
		

	}

}
