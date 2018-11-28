package half;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int[] arr = new int[100];

		System.out.println("正在初始化数组...");
		// 通过循环为数组元素赋值
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1; // 产生1-10000的随机数
		}
		
		//对数组排序
		Arrays.sort(arr);
		
		System.out.println("请输入要查找的数子");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		int start = 0;
		int end = arr.length - 1;
		int middle = -1;
		boolean flag = false; //假设没有这个数
		
		int count = 0;
		
		while(start <= end) {
			count++;
			middle = (start + end) / 2; //中间数的下标
			if (num > arr[middle]) {
				start = middle + 1;
			} else if (num < arr[middle]) {
				end = middle - 1;
			} else {
				flag = true; //找到这个数了
				break;
			}
		}
		
		if (flag) {
			System.out.println("找到了，这个数在数组中的下标：" + middle);
		} else {
			System.out.println("数组中不包含这个数");
		}
		System.out.println("总共查找了" + count + "次");
	}

}
