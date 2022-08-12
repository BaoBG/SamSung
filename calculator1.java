package calculator1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("calculator1"));
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int n = sc.nextInt();
			String m = sc.nextLine();
			String chuoi = "";
			chuoi = sc.next();
			int sum = 0;	
			for (int i = 0; i < chuoi.length(); i++) {
					if (i % 2 == 0) {
						sum += Integer
								.parseInt(String.valueOf(chuoi.charAt(i)));
					}
			}
			System.out.println("#" + tc + " " + sum);

		}
	}

}
