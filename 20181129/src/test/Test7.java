package test;

import java.util.Arrays;
import java.util.TreeSet;

public class Test7 {

	public static void main(String[] args) {
		// 1.为了让IP可以按照字符串的顺序进行比较，我们可以把IP地址全都补成三位数
		// 按照每位所需最多零补充，就意味着每一段都加两个零
		String ip_str = "192.168.0.156     61.37.69.69 192.168.1.126    127.0.0.1";
		ip_str = ip_str.replaceAll("(\\d+)", "00$1"); //因为每位ip至少有1个数字
		System.out.println(ip_str);
		
		ip_str = ip_str.replaceAll("0{0,}(\\d{3})", "$1"); //每段ip保留3位数
		System.out.println(ip_str);
		
		String[] arr = ip_str.split(" +");//根据多个空格分隔数组
		//System.out.println(Arrays.toString(arr));
		
		System.out.println("开始排序。。。。。。");
		
		//排序字符串
		TreeSet<String> ts = new TreeSet<>();
		for (String item : arr) {
			//将数组arr的每个元素插入到TreeSet集合中，根据TreeSet的特性，及String实现了Compareable接口的特性，每次插入元素时就已经开始排序了
			ts.add(item); 
		}
		
		//将有多个0 的ip还原
		for (String ip : ts) {
			String finallIp = ip.replaceAll("0*(\\d)", "$1");
			System.out.println(finallIp);
		}
		
	}

}
