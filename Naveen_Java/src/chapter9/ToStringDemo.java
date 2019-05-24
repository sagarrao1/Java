package chapter9;

public class ToStringDemo {
	public static void main(String[] args) {
	 Student obj=new Student(11,"Sagar rao");	 
	 System.out.println(obj);	 
	}
}

class Student 
{
	int rollno;
	String sname;
	
	public Student(int rollno, String sname) {
		super();
		this.rollno = rollno;
		this.sname = sname;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + "]";
	}

	
}