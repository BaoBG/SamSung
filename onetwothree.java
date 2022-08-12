package onetwothree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("onetwothree"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			int q = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ; i < q; i++){
				for(int j = 0 ; j < n ; j++){
					int x = sc.nextInt();
					if(a[j] != -1){//check nhung nguoi chua bi loai
						a[j] = x;
					}
					
				}//end for j
				int dem1 = 0, dem2 = 0, dem3 = 0;
				for(int j = 0 ; j < n; j++){
					if(a[j] == 1) dem1++;
					if(a[j] == 2) dem2++;
					if(a[j] == 3) dem3++;
				}
				//1: keo, 2 : bua, 3: bao
				if(dem1 > 0 && dem2 > 0 && dem3 == 0){//keo vs bua
					for(int j = 0; j < n; j++){
						if(a[j] == 1){
							a[j] = -1;
						}
					}
				}else if (dem1 > 0 && dem2 == 0 && dem3 > 0) {//keo vs bao
					for(int j = 0; j < n; j++){
						if(a[j] == 3){
							a[j] = -1;
						}
					}
				}else if (dem1 == 0 && dem2 > 0 && dem3 > 0) {//bua vs bao
					for(int j = 0; j < n; j++){
						if(a[j] == 2){
							a[j] = -1;
						}
					}
				}
				
			}//end for i

			System.out.print("#" + tc + " ");
			for(int i = 0; i <n; i++){
				if(a[i] != -1){
					System.out.print(i+1+" ");
				}
			}
			System.out.println();
		}// end test case

	}
}
