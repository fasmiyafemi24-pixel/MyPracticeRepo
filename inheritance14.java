package Assignment;

class Course {
    void courseInfo() {
        System.out.println("Course Information");
    }
}

class Science extends Course {
    void showScience() {
        System.out.println("Science Course");
    }
}

class Commerce extends Course {
    void showCommerce() {
        System.out.println("Commerce Course");
    }
}

class Arts extends Course {
    void showArts() {
        System.out.println("Arts Course");
    }
}
public class inheritance14 {
	
	public static void main(String[] args) {
		

        Science obj = new Science();
        Commerce obj1 = new Commerce();
        Arts obj2 = new Arts();

        obj.courseInfo();
        obj.showScience();

        obj1.courseInfo();
        obj1.showCommerce();

        obj2.courseInfo();
       obj2.showArts();
    }
}


