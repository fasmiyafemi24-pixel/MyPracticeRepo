package Assignment;

class University
{
	static String country="India";
	
	String Universityname;
}

public class static21 {

	public static void main(String[] args) {
		
		University obj=new University();
		obj.Universityname= "kerala university";
		
		University obj1= new University();
		obj1.Universityname="Calicut university";
		
		System.out.println("University:" +obj.Universityname);
		System.out.println("country:" +obj.country);
		
		System.out.println("***********************");
		
		System.out.println("University:" +obj1.Universityname);
		System.out.println("country:" +obj1.country);
		
		
		
		
	}

}
