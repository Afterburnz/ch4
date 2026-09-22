public class DateTwo {



	public static void main(String[] args) {
		printAmerican("Tuesday", 22, "September", 2026);
		printEuropean("Tuesday", 22, "September", 2026);
	}
	
	public static void printAmerican(String day, int date, String month, int year) {
		System.out.println("American: " + day + ", " + month + " " + date + ", " + year);
	}
	public static void printEuropean(String day, int date, String month, int year) {
		System.out.println("European: " + day + " " + date + " " + month + " " + year);
	}
}
