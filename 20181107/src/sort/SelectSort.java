package sort;

import java.util.Arrays;

/**
 * 直接选择排序
 * @author nick
 *
 */
public class SelectSort {

	public static void main(String[] args) {
		int[] arr = {16,25,9,23,90}; //无序的数组
		System.out.println("排序前：" + Arrays.toString(arr));
		
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i; //假设当前循环的i下标的值是最小的
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			
			//经过上面的内层循环后，能够确定出当前数组中最小值的下标
			if (min != i) {
				//交换位置
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
		System.out.println("排序后：" + Arrays.toString(arr));
	}

}
