package calculator3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	static int doUuTien(char c) {
		if (c == '*') {
			return 2;
		}
		return 1;
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("calculator3"));
		Scanner scanner = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int n = scanner.nextInt();
			String m = scanner.nextLine();
			String s = scanner.nextLine();
			// B1: chuyen tu trung to sang hau to
			char stackDau[] = new char[1000];
			char hauTo[] = new char[1000];
			int top = 0;
			int k = 0;
			for (int i = 0; i < n; i++) {
				if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {// la so
					hauTo[k] = s.charAt(i);
					k++;
				} else {
					if (s.charAt(i) == '(') {
						stackDau[top] = s.charAt(i);
						top++;
					} else if (s.charAt(i) == ')') {
						while (top > 0 && stackDau[top - 1] != '(') {
							hauTo[k] = stackDau[top - 1];
							top--;
							k++;
						}
						top--;
					} else {
						while (top > 0 && stackDau[top - 1] != '(') {
							if (doUuTien(s.charAt(i)) <= doUuTien(stackDau[top - 1])) {
								hauTo[k] = stackDau[top - 1];
								top--;
								k++;
							}else{
								break;
							}
						}
						stackDau[top] = s.charAt(i);
						top++;
					}
				}
			}
			while (top > 0) {
				hauTo[k] = stackDau[top - 1];
				top--;
				k++;
			}
			hauTo[k] = 0;
			
			
			//B2:
			int stackSo[] = new int[1000];
			for(int i = 0 ; i < k;  i++){
				if(hauTo[i] >= '0' && hauTo[i] <= '9'){
					stackSo[top] = hauTo[i] - '0';
					top++;
				}else {
					int a = stackSo[top - 1];
					top--;
					int b = stackSo[top -1];
					top--;
					if(hauTo[i] == '+'){
						stackSo[top] = a+b;
						top++;
					}else {
						stackSo[top] = a * b;
						top++;
					}
				}
			}
			System.out.println("#"+tc+" "+stackSo[top - 1]);
		}
	}

}
