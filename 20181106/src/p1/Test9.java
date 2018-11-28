package p1;

public class Test9 {

	public static void main(String[] args) {
		/*
		 * 数组arr长度为5
		 * 数组中每个元素是一个int类型的数组
		 * 但是该数组没有被初始化
		 * 		int[] arr = null;
		 * */
		int[][] arr = new int[3][2];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
