package cryptogram1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	static int[] mang = new int[1000000];
	static int[] mang_phu = new int[1000000];
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input"));
		Scanner sc = new Scanner(System.in);
		for(int tc = 1; tc <=10; tc++){
			int n = sc.nextInt();
			//int[] mang = new int[100000];
			int cau_lenh;
			for(int i = 0; i <n; i++){
				mang[i] = sc.nextInt();
			}
			cau_lenh = sc.nextInt();
			for(int cl = 0; cl < cau_lenh; cl++){
				String c;
				c = sc.next();
				if(c.equals("I")){
					int vi_tri = sc.nextInt();
					int so_luong = sc.nextInt();
					//int[] mang_phu = new int[1000000];
					int k = 0;
					for(int i = 0; i < vi_tri; i++){
						//buoc 1: sao chep sang mang phu
						mang_phu[k] = mang[i];
						k++;
					}
					//B2: them so dau bai cho vao mang phu
					for(int i = 0; i < so_luong; i++){
						mang_phu[k] = sc.nextInt();
						k++;
					}
					//B3: sao chep cac so con lai tu mang chinh vao mang phu
					for(int i = vi_tri; i < n; i++){
						mang_phu[k] = mang[i];
						k++;
					}
					//B4; sao chep mang tam vao mang chinh
					for(int i = 0; i < k; i++){
						mang[i] = mang_phu[i];
					}
					//b5: tang so luong phan tu
					n = k;
				}
				if(c.equals("D")){
					int vi_tri_xoa = sc.nextInt();
					int so_luong_xoa = sc.nextInt();
					for(int i = vi_tri_xoa; i < n-1; i++){
						mang[i] = mang[i+so_luong_xoa];
					}
//					int k = 0;
//					for(int i =0; i < vi_tri_xoa; i++){
//						mang_phu[k] = mang[i];
//						k++;
//					}
//					for(int i = vi_tri_xoa+so_luong_xoa; i < n; i++){
//						mang_phu[k] = mang[i];
//						k++;
//					}
//					for(int i = 0; i <k; i++){
//						mang[i] = mang_phu[i];
//					}
//					n = k;
				}
				if(c.equals("A")){
					int so_luong_them = sc.nextInt();
					int[] s = new int[so_luong_them+1];
					for(int i = 0 ; i < so_luong_them; i++){
						s[i] = sc.nextInt();
					}
					int k = 0;
					for(int i = 0; i < n; i++){
						mang_phu[k] = mang[i];
						k++;
					}
					for(int i = 0; i < so_luong_them; i++){
						mang_phu[k] = s[i];
						k++;
					}
					for(int i = 0; i < k; i++){
						mang[i] = mang_phu[i];
					}
					n = k;
				}
				
			}
			int m = 0;
			if(n > 10){
				m = 10;
			}else {
				m = n;
			}
			System.out.print("#"+tc+" ");
			for(int i = 0; i < m; i++){
				System.out.print(mang[i]+" ");
			}
			System.out.println();
		}
	}
}
