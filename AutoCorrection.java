package AutoCorrection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	static boolean nguyenban(String dic[], String word) {// giu nguyen
		boolean check = false;
		for (int i = 0; i < dic.length; i++) {
			if (word.equals(dic[i])) {
				check = true;
				break;
			}
		}
		return check;
	}

	static boolean delete(String dic[], String word) {// xoa 1 ky tu
		boolean check = false;
		for (int i = 0; i < dic.length; i++) {
			String tmp = word.substring(0, word.length() - 1);
			if (tmp.equals(dic[i])) {
				check = true;
				break;
			}
			// }
		}
		return check;
	}

	static int add(String dic[], String word) {// them ky tu
		int dem = 0;
		for (int i = 0; i < dic.length; i++) {
			// char c = dic[i].charAt(dic[i].length() - 1);
			String tmp = dic[i].substring(0, dic[i].length() - 1);
			// word += c;// thêm ký tự cuối cùng của dic vào cuối của word
			if (word.equals(tmp)) {
				dem++;
			}
		}
		return dem;
	}

	static int replace(String dic[], String word) {// sua ky tu
		int dem = 0;
		for (int i = 0; i < dic.length; i++) {
			String tmp = word.substring(0, word.length() - 1);
			String tmp2 = dic[i].substring(0, dic[i].length() - 1);
			if (tmp.equals(tmp2)) {
				dem++;
			}
		}

		return dem;
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("AutoCorrection"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			String[] dic = new String[n];
			// String word = null;
			System.out.print("#" + tc + " ");
			for (int i = 0; i < n; i++) {
				String temp = sc.next();
				dic[i] = temp;
			}
			for (int i = 0; i < m; i++) {
				String word = sc.next();
				if (nguyenban(dic, word)) {
					System.out.print(0 + " ");
				} else {
					if (delete(dic, word) == true && add(dic, word) == 0
							&& replace(dic, word) == 0) {
						System.out.print(3 + " ");
					} else if (add(dic, word) == 1
							&& delete(dic, word) == false
							&& replace(dic, word) == 0) {
						System.out.print(1 + " ");
					} else if (replace(dic, word) == 1 && add(dic, word) == 0
							&& delete(dic, word) == false) {
						System.out.print(2 + " ");
					} else if (delete(dic, word) == false
							&& add(dic, word) == 0 && replace(dic, word) == 0) {
						System.out.print(4 + " ");
					} else {
						System.out.print(5 + " ");
					}
				}
			}
			System.out.println();
		}
	}

}
