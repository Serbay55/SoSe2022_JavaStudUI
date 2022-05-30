package backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kurse {
	Scanner sc = new Scanner(System.in);
	public Kurse(String name) {
		this.name = name;
		}

		private String name; // setter & getter
		private List<Student> students = new ArrayList<Student>(); // getter
		
		public void addStudent(Student s) {
			students.add(s);
		}
		public List<Student> getStudents() {
			return students;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void removeStudent(Student s) {
			students.remove(s);
		}
		public void createnewcourse(String s) {
			s = sc.nextLine();
			Kurse kurs = new Kurse(s);
			System.out.println(kurs.getStudents());
			for(int i = 0; i < students.size(); i++) {
					if(students.get(i) == null) {
						Student x = new Student();
						x.setName(sc.nextLine());
						students.set(i, x);
					}
				
			}
			
			
		}
		public void secureStringsettername(Student s) {
			char[] ch = s.name.toCharArray();
			StringBuilder strbuild = new StringBuilder();
			for(char c : ch) {
				if(Character.isAlphabetic(c)) {
					strbuild.append(c);
				}
			}
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
			s.surname = strbuild.toString();
		}
		enum JavaSkill{
			 Beginner, Amateur, Mediocre, Experienced, Professional, Maniac;
		 }
		 enum CourseRoom{
			 B048, B040;
		 }
}

