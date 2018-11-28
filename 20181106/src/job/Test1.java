package job;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数");
		int num = input.nextInt();
		
		/*String str_num = num + "";
		int len = str_num.length();*/
		
		int temp = num;
		int len = 0;
		while(temp > 0) {
			temp /= 10;
			len++;
		}
		
		int[] arr = new int[len];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = num % 10;
			num /= 10;
		}
		
		//System.out.println(Arrays.toString(arr));
		
		//通过循环验证这个数组中数是否回文数
		/*boolean flag = true;//假设num是回文数
		for (int i = 0; i < arr.length / 2; i++) {
			int left = arr[i];
			int right = arr[arr.length - 1 - i];
			if (left != right) {
				flag = false;
				break;
			}
		}
		
		if (flag) {
			System.out.println("回文数");
		} else {
			System.out.println("不是回文数");
		}*/
		
		int i = 0;
		for (; i < arr.length / 2; i++) {
			int left = arr[i];
			int right = arr[arr.length - 1 - i];
			if (left != right) {
				break;
			}
		}
		
		if (i == arr.length / 2) {
			System.out.println("是回文数");
		} else {
			System.out.println("不是回文数");
		}
	}

}
