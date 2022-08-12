package gns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	static int convertToNumber(String s) {
		int so = 0;
		if (s.equals("ZRO"))
			so = 0;
		if (s.equals("ONE"))
			so = 1;
		if (s.equals("TWO"))
			so = 2;
		if (s.equals("THR"))
			so = 3;
		if (s.equals("FOR"))
			so = 4;
		if (s.equals("FIV"))
			so = 5;
		if (s.equals("SIX"))
			so = 6;
		if (s.equals("SVN"))
			so = 7;
		if (s.equals("EGT"))
			so = 8;
		if (s.equals("NIN"))
			so = 9;
		return so;
	}

	static String convertToString(int so) {
		String chuoi = "";
		if (so == 0)
			chuoi = "ZRO";
		if (so == 1)
			chuoi = "ONE";
		if (so == 2)
			chuoi = "TWO";
		if (so == 3)
			chuoi = "THR";
		if (so == 4)
			chuoi = "FOR";
		if (so == 5)
			chuoi = "FIV";
		if (so == 6)
			chuoi = "SIX";
		if (so == 7)
			chuoi = "SVN";
		if (so == 8)
			chuoi = "EGT";
		if (so == 9)
			chuoi = "NIN";
		return chuoi;
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("GNS"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String stt = sc.next();
			int n = sc.nextInt();
			String dayCanChuyen[] = new String[10000];
			int temp[] = new int[10000];
			for (int i = 0; i < n; i++) {
				dayCanChuyen[i] = sc.next();
				temp[i] = convertToNumber(dayCanChuyen[i]);
			}

			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (temp[i] > temp[j]) {
						int tg = temp[i];
						temp[i] = temp[j];
						temp[j] = tg;
					}
				}
			}
			for (int i = 0; i < n; i++) {
				dayCanChuyen[i] = convertToString(temp[i]);
			}

			System.out.println("#" + tc);
			for (int i = 0; i < n; i++) {
				System.out.print(dayCanChuyen[i] + " ");
			}
		}
	}
}
