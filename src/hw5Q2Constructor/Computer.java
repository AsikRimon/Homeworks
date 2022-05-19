package hw5Q2Constructor;

public class Computer {
	// variables declared

	public String brandName;
	public String modelName;
	public String operatingSystem;
	public int priceOfComputer;
	public char gradeOfComputer;
	public boolean madeInUsa;

	// default constructor declared
	public Computer() {
		System.out.println("This is from default Contructor of Computer class.");

	}

	// Parameterized constructor declared
	public Computer(String brandName, String modelName, String operatingSystem, int priceOfComputer,
			char gradeOfComputer, boolean madeInUsa) {

		this.brandName = brandName;
		this.modelName = modelName;
		this.operatingSystem = operatingSystem;
		this.priceOfComputer = priceOfComputer;
		this.gradeOfComputer = gradeOfComputer;
		this.madeInUsa = madeInUsa;
		System.out.println("Computer brand name:" + brandName + ", Model name:" + modelName + ", Operating  System:"
				+ operatingSystem + ", Price:" + priceOfComputer + ", Grade:" + gradeOfComputer + ", Made in USA:"
				+ madeInUsa);
	}

	// Parameterized constructor declared
	public Computer(String brandName, String modelName, String operatingSystem, int priceOfComputer,
			boolean madeInUsa) {

		this.brandName = brandName;
		this.modelName = modelName;
		this.operatingSystem = operatingSystem;
		this.priceOfComputer = priceOfComputer;
		this.madeInUsa = madeInUsa;
		System.out.println("Computer brand name:" + brandName + ", Model name:" + modelName + ", Operating  System:"
				+ operatingSystem + ", Price:" + priceOfComputer + ", Made in USA:" + madeInUsa);

	}

	// Parameterized constructor declared
	public Computer(String brandName, String modelName, String operatingSystem, int priceOfComputer,
			char gradeOfComputer) {

		this.brandName = brandName;
		this.modelName = modelName;
		this.operatingSystem = operatingSystem;
		this.priceOfComputer = priceOfComputer;
		this.gradeOfComputer = gradeOfComputer;
		System.out.println("Computer brand name:" + brandName + ", Model name:" + modelName + ", Operating  System:"
				+ operatingSystem + ", Price:" + priceOfComputer + ", Grade:" + gradeOfComputer);

	}

	// Parameterized method implemented
	public void computer(String brandName, String modelName, String operatingSystem, int priceOfComputer,
			char gradeOfComputer, boolean madeInUsa) {
		this.brandName = brandName;
		this.modelName = modelName;
		this.operatingSystem = operatingSystem;
		this.priceOfComputer = priceOfComputer;
		this.gradeOfComputer = gradeOfComputer;
		this.madeInUsa = madeInUsa;
		System.out.println("Computer brand name:" + brandName + ", Model name:" + modelName + ", Operating System:"
				+ operatingSystem + ",Price:" + priceOfComputer + ", Grade:" + gradeOfComputer + ", Made in USA:"
				+ madeInUsa);

	}

}
