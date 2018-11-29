package test;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * 因为字符串是不可改变的序列
		 * 每次修改字符串的文本时，需要频繁的在字符串常量池中开辟空间
		 * 
		 * 通过StringBuilder和StringBuffer来实现字符串的可变序列
		 * 字符串在频繁的修改时，不推荐使用+及concat（）来拼接字符串
		 * StringBuilder和StringBuffer的含义及使用方法是一致的
		 * 区别：
		 * 	StringBuilder是一个非线程安全的类，在多线程环境中可能出现线程安全问题
		 *  StringBuffer是一个线程安全的类
		 * 在单线程环境中推荐使用StringBuilder
		 * 在多线程环境中推荐使用StringBuffer
		 * */
		StringBuilder builder = new StringBuilder("a");
		builder.append("b")   //链式编程 Jquery时的典型应用
		.append("c")
		.append("d")
		.append("e")
		.append(1)
		.append(2);
		//相当于 a + b + c+ d+ e +1+2
		/*String str = builder.toString();
		System.out.println(str);*/
		
		//a***bcde12
		builder.insert(1, "***");  //将指定字符串插入到指定索引位置
		//System.out.println(builder.toString());
		
		//builder.reverse();	//反转字符串的内容
		//System.out.println(builder.toString());
		
		builder.delete(1, 4);  //删除1-4索引之间的字符串，包含1，不包含4
		//System.out.println(builder.toString());
		
		builder.replace(builder.length() - 2, builder.length(), "fg"); //替换指定索引之间的字符串
		System.out.println(builder.toString());
	}

}
