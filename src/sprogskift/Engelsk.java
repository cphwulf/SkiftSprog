package sprogskift;
public class Engelsk implements SprogI{
	
	public void printMenu() {
		System.out.println("Welcome to dogexchange");
		System.out.println("1) show dogs");
		System.out.println("2) pick dog");
		System.out.println("3) search dog by name");
		System.out.println("4) switch to danish");
		System.out.println("9) end program");
		System.out.println("type your choice: ");
	}
	public void printLang() {
		System.out.println("change language: ");
		System.out.println("1) Danish");
		System.out.println("2) English");
	}
	public void printSource() {
		System.out.println("switch datasource: ");
		System.out.println("1) csv");
		System.out.println("2) database");
	}
	
}