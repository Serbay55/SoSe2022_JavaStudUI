package backend;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Student{
	Scanner sc = new Scanner(System.in);
	String kurse;
	String name;
	String surname;
	//Course kurs;
	JavaSkill capability;
	String hiredCompany;
	
	ArrayList<ArrayList<Student>> studentenliste = new ArrayList<ArrayList <Student>>();
	
	public void registerStudent(Student s) throws InputTypeError {
		s.setName(sc.nextLine());
		s.secureStringsettername(s);
		
		/*s.setName(sc.nextLine());
		s.setSurname(sc.nextLine());
		s.setKurs(kurs);
		s.setHiredCompany(sc.nextLine());
		s.setCapability(capability);
		studentenliste.add(s);*/
	}
	
	public void secureStringsettername(Student s) {
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
	public void secureStringsettersurname(Student s) {
		char[] ch = s.surname.toCharArray();
		StringBuilder strbuild = new StringBuilder();
		for(char c : ch) {
			if(Character.isAlphabetic(c)) {
				strbuild.append(c);
			}
		}
		s.surname = null;
		s.surname = strbuild.toString();
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
	TINF21AI2, TINF21AI1; // Man sollte auch Kurse verwalten können, dies ist erstmal außer Acht zu lassen.
}
 enum JavaSkill{
	 Beginner, Amateur, Mediocre, Experienced, Professional, Maniac;
 }
 enum CourseRoom{
	 B048, B040;
 }
 
