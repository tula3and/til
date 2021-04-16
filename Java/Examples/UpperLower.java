import java.util.Scanner;

public class UpperLower {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		
		String before = s.nextLine();
		
		s.close();
		
		System.out.println("Before: " + before);
		
		String after = "";
		
		int i, temp;
		int smallA = (int) 'a';
		int smallZ = (int) 'z';
		for (i = 0; i < before.length(); i++) {
			temp = (int) before.charAt(i);
			if (temp >= smallA && temp <= smallZ) {
				after += String.valueOf(before.charAt(i)).toUpperCase();
			}
			else {
				after += String.valueOf(before.charAt(i)).toLowerCase();
			}
		}
		
		System.out.println("After : " + after);
	}
}
