package testpart2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("testStock"));
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int ngay = scanner.nextInt();
			int von = scanner.nextInt();
			int[] gia_cp = new int[ngay];
			for (int i = 0; i < ngay; i++) {
				gia_cp[i] = scanner.nextInt();
			}

			int tien_hien_co = von;
			int tien_con_lai = 0;

			for (int i = 0; i < ngay - 1; i++) {
				if (gia_cp[i] < gia_cp[i + 1]) {
					int so_cp = (tien_hien_co / gia_cp[i]);
					tien_con_lai = (tien_hien_co - gia_cp[i] * so_cp);
					tien_hien_co = tien_con_lai + so_cp * gia_cp[i + 1];
				}
			}
			int tien_lai = 0;
			tien_lai += tien_hien_co - von;
			System.out.println("#" + tc + " " + tien_lai);
		}
	}
}
