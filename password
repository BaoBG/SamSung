package password;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("password"));
		Scanner scanner = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int n = scanner.nextInt();
			String s = scanner.next();
//			int i = 0;
//			while (s.charAt(i) != s.charAt(i + 1)) {
//				for (int j = 0; j < s.length() - 1; j++) {
//					String temp = "";
//					if (s.charAt(j) == s.charAt(j + 1)) {
//						temp += String.valueOf(s.charAt(j))
//								+ String.valueOf(s.charAt(j + 1));
//						s = s.replace(temp, "");
//						j = 0;
//					}
//
//				}
//				i++;
//				if (i >= s.length() - 1) {
//					break;
//				}
//			}
			//Cach 2:
			int top = 0;
			char stack[] = new char[1000];
			for(int i = 0 ; i < n; i ++){
				if(top > 0 && s.charAt(i) == stack[top - 1]){
					top--;
				}else{
					stack[top] = s.charAt(i);
					top++;
				}
			}
			System.out.print("#" + tc + " ");
			for(int i = 0 ; i < top ; i++){
				System.out.print(stack[i]);
			}
			System.out.println();
		}
	}

}
