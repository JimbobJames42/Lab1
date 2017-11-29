package palidromeFourDigit;

public class PalidromeFourDigit {

	public static boolean isAPalidrome(int x) {
		int first = x % 10;
		int second = (x%100-x%10)/10;
		int third = (x%1000-x%100)/100;
		int fourth = x/1000;
		return first == fourth && second == third;
	}
	
	public static int palindromeTopCheck(int x, int y) {
		if(isAPalidrome(x*y)) {
			System.out.println(x*y + " is a palindrome of highest value!");
			System.out.println("made up of: " + x + " and " + y);
			return x*y;
		}
		else if (x < 6000 || y < 6000) {
			System.out.println("Something happened idk what man but something did");
			System.out.println(x + " "  + y);
			return 0;
		}
		else {
			if(x>y) {
				palindromeTopCheck(x-1,y);
			}
			else {
				palindromeTopCheck(x,y-1);
			}
		}
		return x*y;
	}
	
	public static void main(String[] args) {
		palindromeTopCheck(9999,9999);

	}

}
