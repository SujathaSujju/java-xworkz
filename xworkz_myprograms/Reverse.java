package xworkz_myprograms;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		while (true) {
			String s = sc.next();

			String rev = " ";
			if (s != null && s.isEmpty()) {
				System.out.println(s);
			} else {

				for (int i = s.length() - 1; i >= 0; i--) {
					rev = rev + s.charAt(i);
				}

				System.out.println(rev);

			}
		}
	}
}