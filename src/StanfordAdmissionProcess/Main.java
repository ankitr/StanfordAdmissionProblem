package StanfordAdmissionProcess;

import java.util.Arrays;
import StanfordAdmissionProcess.StanfordComparator;

public class Main {
	
	private static void display(Student[] students) {
		for(int i=students.length-1; i >= 0; i--) {
			System.out.println(students[i]);
		}
	}
	
	public static void main(String args[]) {
		final int SIZE_OF_CLASS = 10;   // I can dream, can't I?
		Student[] cows = new Student[SIZE_OF_CLASS];
		cows[0] = new Student("Alcides", 68, 16, 3.5, 2390, false);
		cows[1] = new Student("Isabela", 68, 17, 3.8, 2400, true);
		cows[2] = new Student("Svetlana", 64, 16, 4.0, 2300, true);
		cows[3] = new Student("Hariprasad", 77, 15, 2.4, 2250, false);
		cows[4] = new Student("Ulf", 72, 17, 3.2, 2270, false);
		cows[5] = new Student("Francine", 73, 18, 3.5, 2310, true);
		for(int i=6; i<SIZE_OF_CLASS; i++) {
			cows[i] = cows[1].clone();
		}
		Arrays.sort(cows, new StanfordComparator());
		display(cows);
	}

}
