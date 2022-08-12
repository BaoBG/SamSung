package robbot;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	private static boolean check(int n, int a[][], int m, int cmd[],
			int xStart, int yStart, int xEnd, int yEnd) {// kiem tra buoc di cua
															// robot
		for (int i = 0; i < m; i++) {
			if (cmd[i] == 1) {// len
				if (xStart - 1 >= 0 && a[xStart - 1][yStart] != 1) {
					xStart--;
				}
			} else if (cmd[i] == 2) {// phai
				if (yStart + 1 < n && a[xStart][yStart + 1] != 1) {
					yStart++;
				}
			} else if (cmd[i] == 3) {// xuong
				if (xStart + 1 < n && a[xStart + 1][yStart] != 1) {
					xStart++;
				}
			} else {// trai
				if (yStart - 1 >= 0 && a[xStart][yStart - 1] != 1) {
					yStart--;
				}
			}
		}
		if (xStart == xEnd && yStart == yEnd) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("robbot"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			int[][] mang = new int[n][n];

			int xStart = 0, yStart = 0, xEnd = 0, yEnd = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					mang[i][j] = sc.nextInt();
					if (mang[i][j] == 2) {
						xStart = i;
						yStart = j;
					}
					if (mang[i][j] == 3) {
						xEnd = i;
						yEnd = j;
					}
				}
			}
			int m = sc.nextInt();
			int cmd[] = new int[m];
			for (int i = 0; i < m; i++) {
				cmd[i] = sc.nextInt();
			}
			System.out.print("#" + tc + " ");
			if (check(n, mang, m, cmd, xStart, yStart, xEnd, yEnd)) {
				System.out.println(0);
			} else {
				boolean daTimDuocDapAn = false;
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						if (mang[i][j] == 0) {
							mang[i][j] = 1;
							if (check(n, mang, m, cmd, xStart, yStart, xEnd,
									yEnd)) {
								System.out.println(i + 1 + " " + (j + 1));
								i = n;
								daTimDuocDapAn = true;
								break;
							} else {
								mang[i][j] = 0;

							}
						}
					}
				}
				if (daTimDuocDapAn == false) {
					System.out.println(-1);
				}
			}
		}

	}

}
