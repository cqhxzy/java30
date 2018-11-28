package sort;

import java.util.Arrays;

/**
 * 插入排序
 * @author Administrator
 *
 */
public class InsertSort {

	public static void main(String[] args) {
		int[] arr = {16,25,9,23,90}; //无序的数组
		
		for (int i = 1; i < arr.length; i++) { //从第二个数开始比较，因为第一个数默认有序
			int temp = arr[i];
			int j = i;  //从j下标开始，从右往左比较
			for (; j > 0 && arr[j - 1] > temp; j--) {
				arr[j] = arr[j - 1]; //将前一个数向后移一位
			}
			arr[j] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
