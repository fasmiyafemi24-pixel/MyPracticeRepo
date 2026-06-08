package Assignment;

class Mall
{
	Mall()
	{
		System.out.println("Welcome to the Mall");
	}
	
	Mall(String name)
	{
		this();
		System.out.println(name);
		
	}
}


public class costructorchaining23 {

	public static void main(String[] args) {
		
		Mall obj=new Mall("Lulu Mall");
		

	}

}
