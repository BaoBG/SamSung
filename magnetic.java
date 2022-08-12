package magnetic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("magnetic"));
		Scanner scanner = new Scanner(System.in);
		
		for(int tc = 1; tc <= 10; tc++){
			int n = scanner.nextInt();
			int[][] mang = new int[101][101];
			
			for(int i = 0; i < n ; i++){
				for(int j = 0; j < n; j++){
					mang[i][j] = scanner.nextInt();
				}
			}
			int dem = 0;
//			B1; duyet tung cot
			for(int j = 0; j <n; j++){
				boolean isRed = false;
				for(int i = 0; i <n; i++){
					if(isRed){//da tim thay so 1
						if(mang[i][j] == 2){
							dem++;
							isRed = false;
						}
					}else {//chua tim thay so 1
						if(mang[i][j] == 1){
							isRed = true;
						}
					}
				}
			}
			System.out.println("#"+tc+" "+dem);
		}
	}

}
