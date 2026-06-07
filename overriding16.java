package Assignment;

class Hospital {
    void emergencyService() {
        System.out.println("Emergency service available");
    }
}

class CityHospital extends Hospital {
    void emergencyService() {
        super.emergencyService();
        System.out.println("City Hospital emergency service");
    }
}

public class overriding16 {

	public static void main(String[] args) {
		

        CityHospital obj = new CityHospital();
        obj.emergencyService();
    }
}


