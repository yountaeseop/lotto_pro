package loto_program;

import java.util.Scanner;

public class lotto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] lottoNums = new int[7]; 
		// 1등 당첨번호
		
		int length = lottoNums.length;
		
		for(int i = 0; i < length; i++) {
			lottoNums[i] = Integer.parseInt(sc.nextLine());
		}
		 
		
		
		
		
		
		System.out.print("선택된 로또 번호 : ");
		for(int i = 0; i < length; i++) {
			System.out.print(lottoNums[i - 1]+",");
			System.out.print("보너스 번호 :"+lottoNums[length]);
		}
		
	}

}
