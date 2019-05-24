package chapter8;
// Binding our variables with methods is called Encapsulation
// hiding data 

public class EncapsulationDemo {

	public static void main(String[] args) {
		Emp e1= new Emp();
		e1.setEmpId(3);
		e1.setEmpName("Sagar");
		
		Emp e2= new Emp();
		e2.setEmpId(4);
		e2.setEmpName("Sanju");
		
		System.out.println(e1.getEmpId());
		System.out.println(e1.getEmpName());
		System.out.println(e2.getEmpId());
		System.out.println(e2.getEmpName());

	}
}

class Emp{
	private int EmpId;
	private String EmpName;
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	
		
}
