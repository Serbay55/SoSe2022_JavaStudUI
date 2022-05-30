package defaultpackage;
import java.util.Scanner;

import backend.Kurse;
import backend.Student;
public class Main {

	public static void main(String[] args) {
		/**
		 * Hier einfach nochmal eure Aufgaben eintragen, die ihr euch zugefügt habt und der Meinung seid, dass ihr dies übernehmen möchtet
		 *
		 * Am Donnerstag hatten wir ja folgende Aufteilung besprochen:
		 *
		 * Tobias und Lukas --> Frontend
		 * Rajaa und Serbay --> Backend
		 * Rafael --> Datenbank
		 */
		Scanner sc = new Scanner(System.in);
		Kurse kurs = new Kurse(sc.nextLine());
		System.out.println(kurs.getName());
		System.out.println(kurs.getStudents());
		kurs.addStudent(new Student());
		System.out.println(kurs.getStudents());
		Kurse kurs2 = new Kurse(sc.nextLine());
		Student x = new Student();
		Student y = new Student();
		y.setName(sc.nextLine());
		x.setName(sc.nextLine());
		kurs2.addStudent(x);
		kurs.addStudent(y);
		

		

	}

}
