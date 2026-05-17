package Assignment;

class person {
	person(){
		System.out.println("person created");
	}
}
class student extends person{
	student(){
		super();
		System.out.println("student created");
		
	}
}

public class superkeyword2 {

	public static void main(String[] args) {
		student obj=new student();
		
	}

}
