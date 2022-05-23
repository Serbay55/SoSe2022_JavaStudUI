package backend;

import java.util.ArrayList;
import java.util.List;

public class Kurse {
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
}
