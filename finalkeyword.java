package Assignment;

class Bank{
	final String IFSC = "bank1234";
	final void showIFSC() {
		System.out.println("The bank IFSC code is: "+ IFSC);
	}
}
class HDFCBank extends Bank{
	void display() {
		System.out.println("accessing parent final variable: "+IFSC);
	}
}
public class finalkeyword {

	public static void main(String[] args) {
		HDFCBank obj=new HDFCBank();
		obj.showIFSC();
		

	}

}
