package palindrome2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Solution {

	static boolean check(String s) {
		int n = s.length();
		for (int i = 0; i <= n / 2; i++) {
			if (s.charAt(i) != s.charAt(n - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("palindrome2"));
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int index = 0;
			index = sc.nextInt();
			String m = sc.nextLine();
			char a[][] = new char[100][100];
			for (int i = 0; i < 100; i++) {
				a[i] = sc.nextLine().toCharArray();
			}

			int kq = 0;
			for (int length = 99; length > 0; length--) {
				int dem = 0;
				// xet hang ngang
				for (int i = 0; i < 100; i++) {
					for (int j = 0; j <= 100 - length; j++) {
						String temp = "";
						for (int z = j; z < j + length; z++) {
							temp += a[i][z];
						}
						if (check(temp)) {
							dem++;
						}
					}
				}
				// xet hang doc
				for (int i = 0; i < 100; i++) {
					for (int j = 0; j <= 100 - length; j++) {
						String temp = "";
						for (int z = j; z < j + length; z++) {
							temp += a[z][i];
						}
						if (check(temp)) {
							dem++;
						}
					}
				}
				if (dem > 0) {
					kq = length;
					break;
				}
			}
			System.out.println("#" + tc + " " + kq);
		}
	}

}
