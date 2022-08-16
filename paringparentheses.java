package paringparentheses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("paringparentheses"));
		Scanner scanner = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			// int n = scanner.nextInt();
			// String m = scanner.nextLine();
			//
			// String s = scanner.nextLine();
			// //String[] string = new String[n];//scanner.next().toCharArray();
			// // for(int i = 0; i < s.length() ; i ++){
			// // s[i] = scanner.nextLine();
			// // }
			// int dem1 = 0, dem2 = 0;//{}
			// int dem3 = 0, dem4 = 0; // []
			// int dem5 = 0, dem6 = 0; // <>
			// int dem7 = 0, dem8 = 0;//()
			// int check = 1;
			// //char c[] = s.toCharArray();
			// for(int i = 0 ; i < s.length(); i++){
			// if(s.charAt(i) == '{'){// {}
			// dem1++;
			// }
			// if(s.charAt(i) == '}'){
			// dem2++;
			// }
			//
			// if(s.charAt(i) == '['){//[]
			// dem3++;
			// }
			// if(s.charAt(i) == ']'){
			// dem4++;
			// }
			//
			// if(s.charAt(i) == '<'){//<>
			// dem5++;
			// }
			// if(s.charAt(i) == '>'){
			// dem6++;
			// }
			//
			// if(s.charAt(i) == '('){//()
			// dem7++;
			// }
			// if(s.charAt(i) == ')'){
			// dem8++;
			// }
			// }
			// if(dem1 != dem2 || dem3 != dem4 || dem5 != dem6 || dem7 != dem8){
			// System.out.println("#"+tc+" 0");
			// }else {
			// System.out.println("#"+tc+" 1");
			// }
			int n = scanner.nextInt();
			String mString = scanner.nextLine();
			String str = scanner.nextLine();
			
			char[] stack = new char[1000];
			int top = 0;
			boolean check = true;
			for (int i = 0; i < n; i++) {
				if (str.charAt(i) == '(' || str.charAt(i) == '['
						|| str.charAt(i) == '{' || str.charAt(i) == '<') {
					stack[top] = str.charAt(i);
					top++;
				} else {// dau dong ngoac
					if (str.charAt(i) == ')' && top > 0
							&& stack[top - 1] == '(') {
						top--;
					} else if (str.charAt(i) == '}' && top > 0
							&& stack[top - 1] == '{') {
						top--;
					} else if (str.charAt(i) == ']' && top > 0
							&& stack[top - 1] == '[') {
						top--;
					} else if (str.charAt(i) == '>' && top > 0
							&& stack[top - 1] == '<') {
						top--;
					} else {
						check = false;
						break;
					}
				}
			}
			if (check == true) {
				System.out.println("#" + tc + " 1");
			} else {
				System.out.println("#" + tc + " 0");
			}
		}

	}

}
