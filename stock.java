package stockexchange;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.BreakIterator;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("stock"));
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		for(int tc = 1; tc <= T; tc++){
			int day = scanner.nextInt();
			int[] price = new int[day];
			for(int i = 0; i < day; i++){
				price[i] = scanner.nextInt();
			}
			int profit = 0;
			while(true){
				int dem = 0;
				int max = 0;
				int index = 0;
				for(int i = 0; i < day; i ++){
					if(price[i] > max){
						max = price[i];
						index = i;
					}
				}
				int curr_pric = 0;
				for(int i = index - 1; i >= 0; i--){
					if(price[i] > 0){
						curr_pric += price[i];
						dem++;
					}
				}
				for(int i = 0; i <= index; i++){
					price[i] = 0;
				}
				profit += max*dem - curr_pric;
				if(max == 0) break;
			}
			System.out.println("#"+tc+" "+profit);
		}
	}

}
