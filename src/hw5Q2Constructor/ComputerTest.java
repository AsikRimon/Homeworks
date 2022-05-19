package hw5Q2Constructor;

public class ComputerTest {
	public static void main(String[] args) {
		// default Constructor initialized
		Computer computer = new Computer();
		// Parameterized constructor initialized
		computer.computer("Apple", "MacBookAir", "MacOSMojave", 800, 'A', false);
		Computer computer1 = new Computer("Apple", "MacBookAir", "MacOSMojave", 800, 'A', false);
		computer1.computer("Apple", "MacBookAir", "MacOSMojave", 800, 'A', false); // method is initialized
		Computer computer2 = new Computer("Apple", "MacBookAir", "MacOSMojave", 800, false);// Parameterized
		Computer computer3 = new Computer("Window", "Surface", "windows OS", 700, 'A', false);
		Computer computer4 = new Computer("Window", "Surface", "windows OS", 700, false);
		Computer computer5 = new Computer("Window", "Surface", "windows OS", 700, 'A');

	}

}
