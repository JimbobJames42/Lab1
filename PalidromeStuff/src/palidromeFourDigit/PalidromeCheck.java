package palidromeFourDigit;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalidromeCheck {

	@Test
	void test() {
		assertTrue(isAPalindrome(9009) == true);
		assertTrue(isAPalindrome(1551) == true);
	}

	private boolean isAPalindrome(int i) {
		int first = i % 10;
		int second = (i%100-i%10)/10;
		int third = (i%1000-i%100)/100;
		int fourth = i/1000;
		return first == fourth && second == third;
	}


}
