package sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author nick
 *
 */
public class BubbleSort {

	/**
	 * 通过java实现冒泡排序
	 * @param args 外部参数
	 */
	public static void main(String[] args) {
		int[] arr = {16,25,9,23,90}; //无序的数组
		System.out.println("排序前：" + Arrays.toString(arr));
		/*
		 * N个数字来排队，两两相比小靠前
		 * 外层循环N-1，内层循环N-1-i
		 * */
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) { //如果j下标的下一个值比当前j下标的值小，则交换位置
					int temp = arr[j];  //交换位置
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		/*
		 * 通过for循环遍历数组
		 * */
		/*for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		
		String str = Arrays.toString(arr); //通过Arrays.toString()方法将数组转换为字符串。
		System.out.println("排序后：" + str);
	}

}
