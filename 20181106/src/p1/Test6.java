package p1;
import java.util.Arrays;

public class Test6 {

	public static void main(String[] args) {
		int[] arr = {8,4,2,1,23,344,12};
		
		//对数组的元素排序
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
