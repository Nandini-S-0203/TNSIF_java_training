package org.tnsif.acc.c2tc.oops;
class Course{
	String courseName="Java Programming";
	void showCourse() {
		System.out.println("Course: "+courseName);
	}
}
class Student extends Course{
	String studentName="Nandini";
	void showStudent() {
		System.out.println("Studentname:"+ studentName);
	}
}


public class SingleLevelInheritance {

	public static void main(String[] args) {
		Student student=new Student();
		student.showStudent();
		student.showCourse();
		// TODO Auto-generated method stub

	}

}
