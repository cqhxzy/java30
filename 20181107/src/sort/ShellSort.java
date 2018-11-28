package sort;

public class ShellSort {

	public static void main(String[] args) {
		int[] arr = {5,8,1,6,4,3,2,7}; //无序的数组
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
