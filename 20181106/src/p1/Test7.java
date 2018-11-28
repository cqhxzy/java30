package p1;

public class Test7 {

	public static void main(String[] args) {
		int[] zhang = {170,60};
		int[] li = zhang;//数组引用数据类型，数组变量保存的是内存地址
		System.out.println("去年张浩的身高：" + zhang[0] + "，体重：" + zhang[1]);
		System.out.println("去年黎明的身高：" + li[0] + "，体重：" + li[1]);
		
		//今年黎明的身高：180，体重：70
		li[0] = 180;
		li[1] = 70;
		
		System.out.println("今年张浩的身高：" + zhang[0] + "，体重：" + zhang[1]);
		System.out.println("今年黎明的身高：" + li[0] + "，体重：" + li[1]);
	}

}
