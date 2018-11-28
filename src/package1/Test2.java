package package1;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数:");
		int num = input.nextInt();
		int temp = num;   //将num复制
		int len = 0;

		//通过循环求出这个数有几位
		while(temp > 0){
			temp /= 10;	// temp = temp / 10;
			len++;
		}
		boolean isTrue = true; //假设这个数是回文数
		for(int i = 0;i < len / 2;i++){ //要清楚为什么len/2
			//求当前循环的数最高位
			int pow = (int)(Math.pow(10,len - 1 - i));
			int left = num / pow % 10;
			//求当前循环的数的最低位
			
			pow = (int)(Math.pow(10,i));
			int right = num / pow % 10;
			if(left != right){
				isTrue = false; //左边和右边不相同，则说明这个数不是回文数
				break;
			}
		}
		if(isTrue){
			System.out.println(num + "是回文数");
		} else {
			System.out.println(num + "不是回文数");
		}
		input.close();
	}
}
