package p1;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = {8,4,2,1,23,344,12};
		
		System.out.println("请输入一个数：");
		int num = input.nextInt();
		
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			sum += arr[i];
			
			if (num == arr[i]) {
				System.out.println("这个数组中包含" + num);
				break;
			}
		}
		//System.out.println(sum);
		
		
	}

}
