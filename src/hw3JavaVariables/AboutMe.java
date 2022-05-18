package hw3JavaVariables;

public class AboutMe {
	public String educationalInstituteHistroy;
	public String academicLife;
	public String personalLifeString;
	// Variables are declared

	public String name = "Asik Rimon";
	public byte age = 27;
	public short myApartmentRent = 1200;
	public int myYearlySalary = 40000;
	public long myBankBalance = 70000;
	public float hight = 1.82888f;
	public double myGrade = 3.50;
	public char sex = 'M';
	public boolean bangladeshNationality = true;
	// Variables are initialized

	public static void main(String[] args) {
		AboutMe aboutme = new AboutMe();
		System.out.println(aboutme.name);
		System.out.println(aboutme.age);
		System.out.println(aboutme.name + aboutme.age);
		System.out.println(aboutme.myYearlySalary + aboutme.myBankBalance);
		System.out.println("My name: " + aboutme.name + "\nMy age: " + aboutme.age + "\nMy yearly income:"
				+ aboutme.myYearlySalary + "\nMy bankbalance:" + aboutme.myBankBalance);

	}

}
