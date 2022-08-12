package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("excel"));
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		for(int tc = 1; tc <= T; tc++){
			int q;
			q = scanner.nextInt();
			System.out.print("#"+tc+" ");
			int[][] mang = new int[51][27];
			for(int i = 0; i < q; i++){
				int cmd = scanner.nextInt();
				if(cmd == 1){//gan
					String str = scanner.next();
					int number = scanner.nextInt();
					int cot = str.charAt(0) - 'A';
					String sHang = "";
					for(int j = 1; j < str.length(); j++){
						sHang += str.charAt(j);
					}
					int hang = Integer.parseInt(sHang);
					mang[hang][cot] = number;
					
				}else {//tinh sum
					int thanhPhan = scanner.nextInt();
					int sum = 0;
					for(int j = 0 ;j < thanhPhan; j++){
						String str = scanner.next();
						if(str.charAt(0) >= '0' && str.charAt(0) <= '9'){//la so
							sum += Integer.parseInt(str);
						}else{//la chu
							if(str.length() <= 3){// la 1 o
								int cot = str.charAt(0) - 'A';
								String sHang = "";
								for(int p = 1; p < str.length(); p++){
									sHang += str.charAt(p);
								}
								int hang = Integer.parseInt(sHang);
								sum += mang[hang][cot];
							}else {//la 1 hang hoac cot
								
								//tim toa do diem 1
								int cot1 = str.charAt(0) - 'A';
								String sHang = "";
								int p = 1;
								while (str.charAt(p) != ':') {
									sHang += str.charAt(p);
									p++;
								}
								int hang1 = Integer.parseInt(sHang);
								
								p++; //p dang dung o dau ':' nen phai tang
								
								//tim toa do diem 2
								int cot2 = str.charAt(p) - 'A';
								p++;
								sHang = "";
								while (p < str.length()) {
									sHang += str.charAt(p);
									p++;
								}
								int hang2 = Integer.parseInt(sHang);
								if(hang1 == hang2){//cung hang
									if(cot1 < cot2){
										for(int x = cot1; x <= cot2; x++){
											sum += mang[hang1][x];
										}
									}else {
										for(int x = cot2; x <= cot1; x++){
											sum += mang[hang1][x];
										}
									}
								}else {//cung cot
									if(hang1 < hang2){
										for(int x = hang1; x <= hang2; x++){
											sum += mang[x][cot1];
										}
									}else {
										for(int x = hang2; x <= hang1; x++){
											sum += mang[x][cot1];
										}
									}
								}
							}
						}
					}
					System.out.print(sum+" ");
				}
			}
			System.out.println();
		}
	}

}

