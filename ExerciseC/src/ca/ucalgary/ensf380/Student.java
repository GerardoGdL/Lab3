package ca.ucalgary.ensf380;

class Student extends Person{

	private String studentNumber;
	private Professor supervisor;
	private double averageMark;
	
	
	public Student(String name, String phone, String email, Address add, int personalNum, String num, Professor supervisor, double avg) {
		super(name, phone, email, add, personalNum);
		setStudentNumber(num);
		setSupervisor(supervisor);
		setAverageMark(avg);
	}
	
	public void setStudentNumber(String num) {
		this.studentNumber = num;
	}
	
	public void setSupervisor(Professor supervisor) {
		this.supervisor = supervisor;
	}
	
	public void setAverageMark(double avg) {
		this.averageMark = avg;
	}
	
	public String getStudentNumber() {
		return this.studentNumber;
	}
	
	public Professor getSupervisor() {
		return this.supervisor;
	}
	
	public double getAverageMark() {
		return this.averageMark;
	}
	
	public boolean isEligibleToEnroll() {
		return (averageMark > 50.0);
	}
	
	protected static String nextPersonalNumber(short type) {
		return String.valueOf(Person.getLastPersonalNumber() + 1);
	}
	
	public boolean hasValidAddress() {
		return address.validate();
	}
	
}
