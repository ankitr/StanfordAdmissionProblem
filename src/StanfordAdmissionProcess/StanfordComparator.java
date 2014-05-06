package StanfordAdmissionProcess;

import java.util.Comparator;

public class StanfordComparator implements Comparator<Student> {
	public int compare(Student stu1, Student stu2) {
		if (!(compareHeight(stu1, stu2) == 0)) {
			return compareHeight(stu1, stu2);
		}
		else if (!(compareName(stu1, stu2) == 0)) {
			return compareName(stu1, stu2);
		}
		else if (!(compareAge(stu1, stu2) == 0)) {
			return compareAge(stu1, stu2);
		}
		else if (!(compareSat(stu1, stu2) == 0)) {
			return compareSat(stu1, stu2);
		}
		else {
			return 0;
		}
	}
	
	private static int compareHeight(Student stu1, Student stu2) {
		Integer height1 = (stu1.getHeight()/10) + (stu1.getHeight()%10);
		Integer height2 = (stu2.getHeight()/10) + (stu2.getHeight()%10);
		return height1.compareTo(height2);
	}
	
	private static int compareName(Student stu1, Student stu2) {
		Integer name1 = stu1.getName().length();
		Integer name2 = stu2.getName().length();
		return name1.compareTo(name2);
	}
	
	private static int compareAge(Student stu1, Student stu2) {
		if (isEven(stu1.getAge()) && !(isEven(stu2.getAge()))) {
			return 1;
		}
		else if (!(isEven(stu1.getAge())) && isEven(stu2.getAge())) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	private static int compareSat(Student stu1, Student stu2) {
		Integer sat1 = stu1.getSat();
		Integer sat2 = stu2.getSat();
		return sat1.compareTo(sat2);
	}
	
	private static boolean isEven(int num) { return ((num % 2) == 0); }
}
