package p1;

import java.util.Scanner;

public class Test4 {
	/**
	 * 声明数组，动态的为数组中每个元素赋值并求平均数
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] scores = new double[5];
		//scores.length属性可以获取数组的长度
		for(int i = 0;i < scores.length;i++) {
			System.out.println("请输入第" + (i + 1) + "个学员的成绩：");
			double score = input.nextDouble();
			//将接收的成绩赋值给数组对应的空间
			scores[i] = score;
		}
		
		/*遍历数组*/
		double sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
			System.out.println("第" + (i + 1) + "个学员的成绩为：" + scores[i]);
		}
		System.out.println("平均分：" + sum / scores.length);
	}

}
