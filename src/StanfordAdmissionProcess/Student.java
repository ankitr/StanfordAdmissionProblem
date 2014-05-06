package StanfordAdmissionProcess;

public class Student extends Animal implements Comparable<Student>, Cloneable{

	private String name;
	private int height;
	private double gpa;
	private int sat;
	
	public Student(String name, int height, int age, double gpa, int sat, boolean gender) {
		super(age, gender);
		this.name = name;
		this.height = height;
		this.gpa = gpa;
		this.sat = sat;
	}
	
	public String getName() { return name; }
	public int getHeight() { return height; }
	public double getGpa() { return gpa; }
	public int getSat() { return sat; }
	
	private int getAwesomeness() { return (int) ((gpa*500)+sat); }
	
	public int compareTo(Student person) { return this.getAwesomeness() - person.getAwesomeness(); }
	public String toString() { return name; }
	public Student clone() { return new Student(name, height, this.getAge(), gpa, sat, this.getGender()); }

}
