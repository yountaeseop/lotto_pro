package loto_program;

import java.util.Scanner;

public class lotto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] lottoNums = new int[7]; 
		// 1�� ��÷��ȣ
		
		int length = lottoNums.length;
		
		for(int i = 0; i < length; i++) {
			lottoNums[i] = Integer.parseInt(sc.nextLine());
		}
		 
		
		
		
		
		
		System.out.print("���õ� �ζ� ��ȣ : ");
		for(int i = 0; i < length; i++) {
			System.out.print(lottoNums[i - 1]+",");
			System.out.print("���ʽ� ��ȣ :"+lottoNums[length]);
		}
		
	}

}
