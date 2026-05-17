package Assignment;

class Product
{
	int productId;
	String productName;
	double price;

	Product(){
		System.out.println("Product Created");
	}
	Product(int id,String name,double p){
		productId=id;
		productName=name;
		price=p;
		}
	
	void displayproduct() {
		System.out.println("productId: "+productId);
		System.out.println("productName: "+productName);
		System.out.println("price: "+price);
		
	}
	
}



public class Constructor {

	public static void main(String[] args) {
		Product obj1=new Product();
		
		Product obj2=new Product(100, "laptop",80000);
		obj2.displayproduct();
	}

}
