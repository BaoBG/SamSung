package PatternLock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	// static boolean checkConnect1(char a, char b) {
	// // check 2 diem khong co diem nam giua
	// if (a == '1') {
	// if (b == '2' || b == '4' || b == '5' || b == '6' || b == '8') {
	// return true;
	// }
	// }
	// if (a == '2') {
	// if (b == '1' || b == '3' || b == '4' || b == '5' || b == '6'
	// || b == '7' || b == '9') {
	// return true;
	// }
	// }
	// if (a == '3') {
	// if (b == '2' || b == '4' || b == '5' || b == '6' || b == '8') {
	// return true;
	// }
	// }
	// if (a == '4') {
	// if (b == '1' || b == '2' || b == '3' || b == '5' || b == '7'
	// || b == '8' || b == '9') {
	// return true;
	// }
	// }
	// if (a == '5') {
	// if (b == '1' || b == '2' || b == '3' || b == '4' || b == '6'
	// || b == '7' || b == '8' || b == '9') {
	// return true;
	// }
	// }
	// if (a == '6') {
	// if (b == '1' || b == '2' || b == '3' || b == '5' || b == '7'
	// || b == '8' || b == '9') {
	// return true;
	// }
	// }
	// if (a == '7') {
	// if (b == '2' || b == '4' || b == '5' || b == '6' || b == '8') {
	// return true;
	// }
	// }
	// if (a == '8') {
	// if (b == '1' || b == '3' || b == '4' || b == '5' || b == '6'
	// || b == '7' || b == '9') {
	// return true;
	// }
	// }
	// if (a == '9') {
	// if (b == '2' || b == '4' || b == '5' || b == '6' || b == '8') {
	// return true;
	// }
	// }
	// return false;
	// }
	//
	// static boolean checkConnect2(char a, char b, int counting[]) {
	// // kiem tra 2 diem co diem nam giua
	// if (a == '1') {
	// if(b =='3' && counting[2] == 1){
	// return true;
	// }
	// if(b =='7' && counting[4] == 1){
	// return true;
	// }
	// if(b =='9' && counting[5] == 1){
	// return true;
	// }
	// }
	// if (a == '2') {
	// if(b == '8' && counting[5] == 1){
	// return true;
	// }
	// }
	// if (a == '3') {
	// if(b =='1' && counting[2] == 1){
	// return true;
	// }
	// if(b =='7' && counting[5] == 1){
	// return true;
	// }
	// if(b =='9' && counting[6] == 1){
	// return true;
	// }
	// }
	// if (a == '4') {
	// if(b =='6' && counting[5] == 1){
	// return true;
	// }
	// }
	// if (a == '5') {
	// //nothing
	// }
	// if (a == '6') {
	// if(b =='4' && counting[5] == 1){
	// return true;
	// }
	// }
	// if (a == '7') {
	// if(b =='1' && counting[4] == 1){
	// return true;
	// }
	// if(b =='3' && counting[5] == 1){
	// return true;
	// }
	// if(b =='9' && counting[8] == 1){
	// return true;
	// }
	// }
	// if (a == '8') {
	// if(b == '2' && counting[5] == 1){
	// return true;
	// }
	// }
	// if (a == '9') {
	// if(b =='1' && counting[5] == 1){
	// return true;
	// }
	// if(b =='3' && counting[6] == 1){
	// return true;
	// }
	// if(b =='7' && counting[8] == 1){
	// return true;
	// }
	// }
	// return false;
	// }
	//
	// static boolean check(String s){
	// if(s.charAt(3) == 0) return false;
	// int counting[] = new int[10];
	// int i;
	// for(i = 0; s.charAt(i-1) != 0; i++){
	// if(checkConnect1(s.charAt(i),s.charAt(i+1))){
	// //khong co diem nam giua
	// int index = s.charAt(i) - '0';
	// counting[index]++;
	// if(counting[index] == 2){
	// return false;
	// }
	// }else {
	// //co diem nam giua
	// if(checkConnect2(s.charAt(i),s.charAt(i+1),counting)){
	// int index = s.charAt(i) - '0';
	// counting[index]++;
	// if(counting[index] == 2){
	// return false;
	// }
	// }else {
	// return false;
	// }
	// }
	// }
	// int index = s.charAt(i) - '0';
	// counting[index]++;
	// if(counting[index] == 2) return false;
	// return true;
	//
	// }
	//
	// public static void main(String[] args) throws FileNotFoundException {
	// System.setIn(new FileInputStream("PatternLock"));
	// Scanner sc = new Scanner(System.in);
	//
	// int T = sc.nextInt();
	// for (int tc = 0; tc <= T; tc++) {
	// int n = sc.nextInt();
	//
	// System.out.println("#" + tc + " ");
	// for (int i = 0; i < n; i++) {
	// String str = sc.next();
	// if (check(str)) {
	// System.out.print(1);
	// } else {
	// System.out.print(0);
	// }
	// }
	// System.out.println();
	// }
	// }
	public static boolean check(int a, int b, int[] chiso) {
		if (a == 1 && b == 7 || a == 7 && b == 1) {
			if (chiso[0] == 0 || chiso[6] == 0 || chiso[3] == 1) {
				return false;
			}
		} else if (a == 2 && b == 8 || a == 8 && b == 2) {
			if (chiso[1] == 0 || chiso[7] == 0 || chiso[4] == 1) {
				return false;
			}
		} else if (a == 3 && b == 9 || a == 9 && b == 3) {
			if (chiso[2] == 0 || chiso[8] == 0 || chiso[5] == 1) {
				return false;
			}
		} else if (a == 1 && b == 3 || a == 3 && b == 1) {
			if (chiso[0] == 0 || chiso[2] == 0 || chiso[1] == 1) {
				return false;
			}
		} else if (a == 4 && b == 6 || a == 6 && b == 4) {
			if (chiso[3] == 0 || chiso[5] == 0 || chiso[4] == 1) {
				return false;
			}
		} else if (a == 7 && b == 9 || a == 9 && b == 7) {
			if (chiso[6] == 0 || chiso[8] == 0 || chiso[7] == 1) {
				return false;
			}
		} else if (a == 1 && b == 9 || a == 9 && b == 1) {
			if (chiso[0] == 0 || chiso[8] == 0 || chiso[4] == 1) {
				return false;
			}
		} else if (a == 3 && b == 7 || a == 7 && b == 3) {
			if (chiso[2] == 0 || chiso[6] == 0 || chiso[4] == 1) {
				return false;
			}
		}
		if (chiso[b - 1] == 0)
			return false;
		return true;
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("PatternLock"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			String m = sc.nextLine();
			System.out.print("#" + tc + " ");
			for (int i = 1; i <= n; i++) {
				String s = sc.nextLine();
				int[] mang = new int[s.length()];
				for (int j = 0; j < s.length(); j++) {
					mang[j] = Integer.valueOf(s.charAt(j) - '0');
				}
				int[] chiso = new int[9];
				for (int j = 0; j < 9; j++) {// 1: chưa đi qua, 0: đã đi qua
					chiso[j] = 1;
				}
				// Xử lý
				boolean kt = true;
				for (int j = 0; j < mang.length - 1; j++) {
					int a = mang[j];
					int b = mang[j + 1];
					if (a == b) {
						kt = false;
						break;
					}
					if (check(a, b, chiso)) {
						chiso[a - 1] = 0;
					} else {
						kt = false;
						break;
					}
				}

				if (kt == true && mang.length >= 4) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}

}
