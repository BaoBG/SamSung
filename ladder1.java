package ladder1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("ladder1"));
		Scanner scanner = new Scanner(System.in);
		
		//int T = scanner.nextInt();
		for(int tc = 1; tc <= 10; tc++){
			int index = scanner.nextInt();
			int[][] mang = new int[101][101];
			int[] thang = new int[101];
			int k = 0;
			int cot  = 0;
			for(int i = 0; i < 100; i++){
				for(int j = 0; j < 100; j++){
					if(i == 0){
						mang[i][j] = scanner.nextInt();
						//B1: tim va luu tat ca cac cot  = 1 vao mang thang
						if(mang[i][j] == 1){
							thang[k] = j;
							k++;
						}
					}
					else if (i == 99) {//B2: tim cot co so 2;
						mang[i][j] = scanner.nextInt();
						if(mang[i][j] == 2){
							cot = j;
						}
					}
					else {
						mang[i][j] = scanner.nextInt();
					}
				}
			}
			int t = 0;
			for(int i = 0; i < k; i++){
				if(thang[i] == cot){
					t = i;
				}
			}
			//B3: di tu hang 99 len hang 0 theo quy tac
			int i = 99;
			while(i > 0){
				//B4; Xet ben trai xem co = 1 hay khong;
				if(cot - 1 >= 0 && mang[i][cot-1] == 1){
					cot = thang[t - 1];//B4.1: re trai => nhay sang cot phia ben trai voi mang da tim o B1
					t--;
					i--;
				}
				else if (cot + 1 < 100 && mang[i][cot+1] == 1) {//B5: xet ben phai xem co = 1 hay khong?
					cot = thang[t + 1];//B5.1: re phai => nhay sang cot phia ben phai voi mang da tim o B1
					t++;
					i--;
				}
				else { //B6: neu B4 va B5 deu sai: di thang len tren
					i--;
				}
			}
			System.out.println("#"+index+" "+cot);
		}
	}

}
