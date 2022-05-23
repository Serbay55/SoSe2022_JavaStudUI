package backend;

import java.util.Scanner;

public class Student{
	Scanner sc = new Scanner(System.in);
	String name;
	String surname;
	Course kurs;
	JavaSkill capability;
	String hiredCompany;
	
	public void registerStudent(Student s) throws InputTypeError {
		s.name = sc.nextLine();
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}

 enum Course{
	TINF21AI2;
}
 enum JavaSkill{
	 Beginner, Amateur, Mediocre, Experienced, Professional, Maniac;
 }
 enum CourseRoom{
	 B048;
 }
 
