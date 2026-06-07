package Assignment;

interface Transport
{
	void booking();
}

class Bus implements Transport
	
{
	public void booking()
	{
		System.out.println("Bus booking");
	}
}

class Flight implements Transport
{
	public void booking()
	{
		System.out.println("Flight booking");
	}
}

public class interface18 {

	public static void main(String[] args) {
		
		Transport obj;
		
		obj=new Bus();
		obj.booking();
		
		obj=new Flight();
		obj.booking();
		
	}

}
