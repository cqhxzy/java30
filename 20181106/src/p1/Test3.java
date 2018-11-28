package p1;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * 在内存中开辟了长度为5的空间
		 * 每个空间的元素的类型为String
		 * String是引用数据类型，因此每个空间的默认值是null
		 * */
		String[] arr = new String[5];
		//数组名[下标] = 值;
		arr[0] = "牛奶";
		arr[1] = "蛋糕";
		
		//获取数组中的元素
		//数组名[下标]
		String str = arr[0];
		System.out.println(str);
		
		str = arr[2];//获取下标为2的元素
		System.out.println(str);//输出结果为null，因为没有为下标为2的元素赋值
		
		//arr[5] = "面包";//这行代码编译无法通过，因为数组长度为5，下标最大为4，因此会出现数组越界的异常
		//java.lang.ArrayIndexOutOfBoundsException    数组越界的异常
	}

}
