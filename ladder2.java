package ladder2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("ladder2"));
		Scanner scanner = new Scanner(System.in);
		
		for(int tc = 1; tc <= 10; tc++){
			int index = scanner.nextInt();
			int[][] mang = new int[101][101];
			int[] thang = new int[101];
			int k = 0;
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
					else {
						mang[i][j] = scanner.nextInt();
					}
				}
			}
			int min = 9999999;
			int kq = 0;
			for(int j = 0; j < k; j++){
				int soBuoc = 1;
				int cot = thang[j];
				int t = j;
				//B3: di tu hang 99 len hang 0 theo quy tac
				int i = 99;
				while(i > 0){
					//B4; Xet ben trai xem co = 1 hay khong;
					if(cot - 1 >= 0 && mang[i][cot-1] == 1){
						soBuoc += (thang[t] - thang[t-1]);
						cot = thang[t - 1];//B4.1: re trai => nhay sang cot phia ben trai voi mang da tim o B1
						t--;
						i--;
						soBuoc++;
					}
					else if (cot + 1 < 100 && mang[i][cot+1] == 1) {//B5: xet ben phai xem co = 1 hay khong?
						soBuoc += (thang[t+1] - thang[t]);
						cot = thang[t + 1];//B5.1: re phai => nhay sang cot phia ben phai voi mang da tim o B1
						t++;
						i--;
						soBuoc++;
					}
					else { //B6: neu B4 va B5 deu sai: di thang len tren
						i--;
						soBuoc++;
					}
				}
				if(soBuoc <= min) {
					min = soBuoc;
					kq = cot;
				}
			}
			
			System.out.println("#"+tc+" "+kq);
		}
	}

}
