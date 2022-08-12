package string;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("string"));
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int index = sc.nextInt(); // doc chi so
			String mString = sc.nextLine();
			String chuoi = sc.nextLine(); // doc chuoi can tim
			//sc.nextLine();
			String cau = sc.nextLine();
			
			int count = 0;
			int do_dai = chuoi.length();
			for(int i = 0; i <= cau.length()- do_dai; i++){
				String temp = "";
				for(int j = i; j < i+do_dai; j++){
					temp += String.valueOf(cau.charAt(j));
				}
				if(temp.equals(chuoi)){
					count++;
				}
			}
			
			System.out.println("#" + index + " " +count);
		}
	}

}
