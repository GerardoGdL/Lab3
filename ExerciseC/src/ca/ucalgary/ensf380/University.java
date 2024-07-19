package ca.ucalgary.ensf380;

public class University {

	public static void main(String[] args) {
		Address address1 = new Address("5", "Calgary", "AB", "345876", "Canada");
		Address address2 = new Address("6", "Calgary", "AB", "345875", "Canada");
		Professor professor = new Professor("Julian", "111-222-3333", "julian@ucalgary.ca", address2, 7, "31567", 70000.00);
		Student student1 = new Student("Lucas", "123-456-7890", "lucas@ucalgary.ca", address1, 5, "2088", professor, 75.5);
		Student student2 = new Student("Sarah", "098-765-4321", "sarah@ucalgary.ca", address1, 2, "5066", professor, 48.3);
		
		//Testing system
		
		//Original Values:
		String lucas = String.format("Name: %s\nPhone: %s\nEmail: %s\nAddress: %s\nLast Personal Number: %d\nStudent Number: %s\nProf ID: %s\nAverage Mark: %f", student1.getName(), student1.getPhoneNumber(), student1.getEmailAddress(), student1.getAddress(), Person.getLastPersonalNumber(), student1.getStudentNumber(), student1.getSupervisor(), student1.getAverageMark());
		System.out.println("Lucas info:\n" + lucas);
		System.out.println("------------------------");
		String sarah = String.format("Name: %s\nPhone: %s\nEmail: %s\nAddress: %s\nLast Personal Number: %d\nStudent Number: %s\nProf ID: %s\nAverage Mark: %f", student2.getName(), student2.getPhoneNumber(), student2.getEmailAddress(), student2.getAddress(), Person.getLastPersonalNumber(), student2.getStudentNumber(), student2.getSupervisor(), student2.getAverageMark());
		System.out.println("Sarah info:\n" + sarah);
		System.out.println("------------------------");
		System.out.println("Lucas can enroll: " + student1.isEligibleToEnroll());
		System.out.println("Sarah can enroll: " + student2.isEligibleToEnroll());
		
		student1.setStudentNumber("2089");
		student2.setAverageMark(50.5);
		System.out.println("After changing Lucas's number: " + student1.getStudentNumber());
		System.out.println("After changing Sarah's mark: " + student2.getAverageMark());
		System.out.println("Lucas can enroll: " + student1.isEligibleToEnroll());
		System.out.println("Sarah can enroll: " + student2.isEligibleToEnroll());
		System.out.println("Sarah and Lucas celebrate!");
	}

}
