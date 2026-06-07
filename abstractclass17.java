package Assignment;

abstract class Employee3 {

    abstract void calculateSalary();

    void employeeDetails() {
        System.out.println("Employee Details");
    }
}

class FullTimeEmployee extends Employee3 {

    void calculateSalary() {
        System.out.println("Full Time Employee Salary = 50000");
    }
}

class PartTimeEmployee extends Employee3 {

    void calculateSalary() {
        System.out.println("Part Time Employee Salary = 20000");
    }
}


    	public class abstractclass17 {

    		public static void main(String[] args) {
    			

        Employee3 obj = new FullTimeEmployee();
        obj.employeeDetails();
        obj.calculateSalary();

        Employee3 obj1 = new PartTimeEmployee();
        obj1.employeeDetails();
        obj1.calculateSalary();
    }
}


