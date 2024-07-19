package ca.ucalgary.ensf380;

class Professor extends Person {

	private String teacherNumber;
	private double salary;
	
	public Professor(String name, String phone, String email, Address add, int personalNum, String teacherNum, double sal) {
		super(name, phone, email, add, personalNum);
		setTeacherNumber(teacherNum);
		setSalary(sal);
	}
	
	public void setTeacherNumber(String num) {
		this.teacherNumber = num;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getTeacherNumber() {
		return this.teacherNumber;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	protected static String nextPersonalNumber(short type) {
		return String.valueOf(Person.getLastPersonalNumber() + 1);
	}
	
	public boolean hasValidAddress() {
		return address.validate();
	}
}
