package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {
	public void studentName() {
		String studentName1 = "NAKULESH";

		System.out.println(" NAME = " + studentName1);
	}

	public void studentdept() {
		String studept1 = "EEE";

		System.out.println(" DEPARTMENT  =  " + studept1);

	}

	public void studentId() {
		String stuId1 = "16101";

		System.out.println(" ID CARD NUMBER  =  " + stuId1);

	}

	public static void main(String[] args) {
		System.out.println(" STUDENT DETAILS");
		
		College clg = new College();
		clg.collegeName();
		
		Department dep = new Department();
		dep.department();
		
		Student stu = new Student();
		stu.studentName();
		stu.studentdept();
		stu.studentId();

	}

}
