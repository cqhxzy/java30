package job;

public class Test3 {

	public static void main(String[] args) {
		//空指针异常
		String str = "hello";
		//System.out.println(str.length());
		
		str = null; //此时str没有内存地址，当对一个null的引用数据类型的变量调用其属性和方法的时候，会出现空指针异常
					// java.lang.NullPointerException
		System.out.println(str.length());
	}

}
