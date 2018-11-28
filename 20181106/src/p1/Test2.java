package p1;

public class Test2 {

	/**
	 * 声明数组的几种方式
	 * @param args
	 */
	public static void main(String[] args) {
		//声明数组的时候就实例化数组
		/*
		 * 堆中开辟了一个连续性，长度为10的空间
		 * 每个空间（数组元素）中只能存int类型的值
		 * 访问数组实际访问的是内存地址
		 * 数组中每个元素的会使用他的默认值。
		 * 
		 * 8种数据类型的默认值：
		 * 	byte：0
		 *  short：0
		 *  int：0
		 *  long：0
		 *  float：0.0
		 *  double:0.0
		 *  
		 *  char:' '
		 *  boolean:false
		 *  
		 *  String:null,引用数据类型的默认值都是null
		 * */
		int[] arr1 = new int[10];
		System.out.println(arr1);
		
		//不推荐用以下的方式声明数组
		int arr6[] = new int[5];
		

		double[] arr2 = null; //声明数组，但是没有开辟空间
		
		int[] arr3;
		arr3 = new int[5];
		
		//声明数组时为数组赋值，静态声明数组
		int[] arr4 = {1,2,3,4};
		
		//和上面的做法相似
		int[] arr5 = new int[] {1,2,3,4};
		
		
		
	}

}
