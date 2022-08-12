package Thy2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("Thy2"));
		Scanner sc = new Scanner(System.in);
		for (int t = 1; t <= 10; t++) {
			int n = sc.nextInt();
			int chiso = n;
			int[] mang = new int[10000];
			for (int tc = 0; tc < n; tc++) {
				mang[tc] = sc.nextInt();
			}

			int solenh = sc.nextInt();
			for (int i = 1; i <= solenh; i++) {
				String insert = sc.next();
				if (insert.equals("I")) {
					int x = sc.nextInt();
					int y = sc.nextInt();
					int[] s = new int[y];
					for (int j = 0; j < y; j++) {
						s[j] = sc.nextInt();
					}
					chiso += y;
					for (int z = 0; z < chiso; z++) {
						if (z == x) {
							int[] tmp = new int[chiso - x - y];
							int l = x;
							for (int k = 0; k < tmp.length; k++) {
								tmp[k] = mang[l];
								l++;
							}
							int h = 0;
							for (int m = x; m < y + x; m++) {
								mang[m] = s[h];
								h++;
							}
							int b = 0;
							for (int m = y + x; m < chiso; m++) {
								mang[m] = tmp[b];
								b++;
							}
						}

					}
				} else if (insert.equals("D")) {
					int x = sc.nextInt();
					int y = sc.nextInt();
					for (int e = x; e < 1000; e++) {
						mang[e] = mang[e + y];
					}
				}
			}

			System.out.print("#" + t + " ");
			for (int p = 0; p < 10; p++) {
				System.out.print(mang[p] + " ");
			}
			System.out.print("\n");

		}

	}

}
