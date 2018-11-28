package sort;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		// 声明长度为10000的数组，数组中的元素为随机数
		int[] arr = new int[10000000];

		System.out.println("正在初始化数组...");
		// 通过循环为数组元素赋值
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100000) + 1; // 产生1-10000的随机数
		}

		System.out.println("-----开始排序-----");
		long begin = System.currentTimeMillis();// 返回1970-1-1 0:0:0开始执行所经历的毫秒

		// 利用冒泡排序
		// test1(arr);

		// 利用选择排序
		// test2(arr);

		// 插入排序
		// test3(arr);

		//Arrays.sort(arr);
		
		//希尔排序
		test4(arr);

		long end = System.currentTimeMillis();
		long time = end - begin; // 两个时间差则为排序所经历的时间差
		System.out.println("-----排序结束消耗时间：" + time + "-----");// 得到毫秒，1秒=1000毫秒
	}

	/**
	 * 通过冒泡排序测试指定长度数组排序执行时间
	 * 
	 * @param arr
	 */
	public static void test1(int[] arr) {
		int j, temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) { // 如果j下标的下一个值比当前j下标的值小，则交换位置
					temp = arr[j]; // 交换位置
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	/**
	 * 利用选择排序测试
	 * 
	 * @param arr
	 */
	public static void test2(int[] arr) {
		int i, j, min;
		for (i = 0; i < arr.length - 1; i++) {
			min = i; // 假设当前循环的i下标的值是最小的
			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			// 经过上面的内层循环后，能够确定出当前数组中最小值的下标
			if (min != i) {
				// 交换位置
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}

	/**
	 * 利用插入排序
	 * 
	 * @param arr
	 */
	public static void test3(int[] arr) {
		for (int i = 1; i < arr.length; i++) { // 从第二个数开始比较，因为第一个数默认有序
			int temp = arr[i];
			int j = i; // 从j下标开始，从右往左比较
			for (; j > 0 && arr[j - 1] > temp; j--) {
				arr[j] = arr[j - 1]; // 将前一个数向后移一位
			}
			arr[j] = temp;
		}
	}

	public static void test4(int[] arr) {
		// 增量gap，并逐步缩小增量
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			// 从第gap个元素，逐个对其所在组进行直接插入排序操作
			for (int i = gap; i < arr.length; i++) {
				int j = i;
				int temp = arr[j];
				if (arr[j] < arr[j - gap]) {
					while (j - gap >= 0 && temp < arr[j - gap]) {
						// 移动法
						arr[j] = arr[j - gap];
						j -= gap;
					}
					arr[j] = temp;
				}
			}
		}
	}
}
