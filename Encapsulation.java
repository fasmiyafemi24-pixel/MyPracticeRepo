package Assignment;

class Employee
{
	private int empid;
	private String empName;
	private double salary;
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public void displaydetails() {
		System.out.println("Employee ID:"+empid);
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee Salary:"+salary);
	}
	

	
}
public class Encapsulation {

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.setEmpid(101);
		obj.setEmpName("Leo");
		obj.setSalary(100000);
		
		obj.displaydetails();
		}

}
