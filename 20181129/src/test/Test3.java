package test;

public class Test3 {

	public static void main(String[] args) {
		/*String str = "zhangsan lisi wangwu zhaoliu";
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}*/
		
		String str = "zhangsan    lisi  wangwu      zhaoliu";
		String[] arr = str.split("[ ]{1,}");
		/*for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}*/
		
		String str2="zhangsanqqqqqqxiaoqianeeeeeeeeeeeewangwuffzhaoliu";
		arr = str2.split("(.)\\1{1,}"); //根据重复的字符分割数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		
		

	}

}
