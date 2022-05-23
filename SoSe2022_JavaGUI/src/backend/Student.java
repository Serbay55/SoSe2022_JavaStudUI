package backend;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Student{
	Scanner sc = new Scanner(System.in);
	String name;
	String surname;
	Course kurs;
	JavaSkill capability;
	String hiredCompany;
	
	List studentenliste = new ArrayList();
	
	public void registerStudent(Student s) throws InputTypeError {
		s.setName(sc.nextLine());
		s.secureStringsetter(s);
		
		/*s.setName(sc.nextLine());
		s.setSurname(sc.nextLine());
		s.setKurs(kurs);
		s.setHiredCompany(sc.nextLine());
		s.setCapability(capability);
		studentenliste.add(s);*/
	}
	
	public void secureStringsetter(Student s) {
		char[] ch = s.name.toCharArray();
		StringBuilder strbuild = new StringBuilder();
		for(char c : ch) {
			if(Character.isAlphabetic(c)) {
				strbuild.append(c);
			}
		}
		s.name = null;
		s.name = strbuild.toString();
	}

	public Course getKurs() {
		return kurs;
	}

	public void setKurs(Course kurs) {
		this.kurs = kurs;
	}

	public JavaSkill getCapability() {
		return capability;
	}

	public void setCapability(JavaSkill capability) {
		this.capability = capability;
	}

	public String getHiredCompany() {
		return hiredCompany;
	}

	public void setHiredCompany(String hiredCompany) {
		this.hiredCompany = hiredCompany;
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
 
