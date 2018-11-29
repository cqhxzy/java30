package test;

public class Test4 {

	public static void main(String[] args) {
		//test1();
		//test2();
		test3();
	}

	public static void test1() {
		//把叠词替换成#
		String str = "zhangsanQQQQQQQQQQQQlisiUUUUUUUUUUwangwu";
		str=str.replaceAll("(.)\\1+", "#");
		System.out.println(str);

	}
	
	public static void test2() {
		//把多个Q变成一个Q，把多个U变成一个U
		String str = "zhangsanQQQQQQQQQQQQlisiUUUUUUUUUUwangwu";
		str=str.replaceAll("(.)\\1+", "$1");
		System.out.println(str);
	}
	
	public static void test3() {
		String tel="18790908768";//187****8768
		/*StringBuilder builder = new StringBuilder();
		builder.append(tel.substring(0, 3));//187
		builder.append("****");
		builder.append(tel.substring(7)); //从7下标开始截取至字符串末尾
		System.out.println(builder);*/
		
		//正则表达式实现
		tel=tel.replaceAll("(\\d{3})(\\d{4})(\\d{4})", "$1****$3");//取第一组和第3组的值
		/*
			1  2  3组
		 	第一组：手机号号码前三位
		 	第二组：中间4位
		 	第三组：后4位
		 * */
		System.out.println(tel);

	}
}
