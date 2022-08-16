package passwordgenerator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("passwordgenerator"));
		Scanner scanner = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int index = scanner.nextInt();

			int mang[] = new int[8];
			for (int i = 0; i < 8; i++) {
				mang[i] = scanner.nextInt();
			}
			int so_bi_tru = 1;
			int n = 8;

			System.out.print("#" + index + " ");
			while (mang[7] != 0) {
				mang[0] -= so_bi_tru;
				if (mang[0] < 0) {
					mang[0] = 0;
					// break;
				}
				so_bi_tru++;
				int temp = mang[0]; // gán biến tạm = phần tử đầu
				for (int i = 0; i < n - 1; i++) {
					mang[i] = mang[i + 1]; // dồn mảng

					// tăng biến bị trừ lên;

				}
				mang[n - 1] = temp; // phần tử cuối bằng biến tạm - số
				if (so_bi_tru == 6) {
					so_bi_tru = 1;
				}
			}

			for (int z = 0; z < 8; z++) {
				System.out.print(mang[z] + " ");
			}
			System.out.println();
		}
	}

}
