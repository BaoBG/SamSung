import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
 
	public static void main(String[] args) throws FileNotFoundException {

		System.setIn(new FileInputStream("input"));
		Scanner scanner = new Scanner(System.in);
		// code
		int T = scanner.nextInt();
		for(int tc = 1 ; tc <= T; tc ++){
			int n = scanner.nextInt();
			int[] a = new int [1000];
			
			for(int i = 0; i < n; i++){
				a[i] = scanner.nextInt();
			}
			
			while(true){
				boolean check = false;
				//B1: duyet nguoc
				for(int i = n - 1; i > 0; i--){
					//buoc 2: kiem tra 2 phan tu gan nhau
					if (a[i] == a[i-1]) {
						check = true;
						//buoc 2.1 
						a[i-1] *= 2;
						//buoc 2.3 don mang
						for(int j = i; j < n - 1; j++)
						{
							a[j] = a[j+1];
						}
						n--;
						break;
					}
				}
				
				//buoc 3; kiem tra xem tro choi co choi duoc nua khong
				if (check == false) {
					break;
				}
			}
			System.out.println("#"+tc+" "+a[n-1]);
		}
	}
}
