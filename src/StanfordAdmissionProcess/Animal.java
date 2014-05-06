package StanfordAdmissionProcess;

public abstract class Animal {
	private int age;
	private boolean gender;
	
	public Animal(int age, boolean gender) {
		this.age = age;
		this.gender = gender;
	}
	public int getAge() { return age; }
	public boolean getGender() { return gender; }
}