package Assignment;

class UPI implements Payment {
    @Override
    public void makePayment() {
        System.out.println("Payment successful via UPI: Scanning QR code...");
    }
}

class CreditCard implements Payment {
    @Override
    public void makePayment() {
        System.out.println("Payment successful via Credit Card: Processing bank gateway...");
    }
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
