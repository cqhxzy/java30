package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test5 {

	public static void main(String[] args) {
		String str = "da jia hao,ming tian bu fang jia";
		//定义正则
		String regex="\\b[a-zA-Z]{3}\\b";
		//1.将正则包装成对象
		Pattern p=Pattern.compile(regex);
		//2.通过正则对象的matcher方法字符串相关联，获取要对字符串操作的匹配器对象Macher
		Matcher m= p.matcher(str);
		//3.通过Matcher匹配器对象的方法对字符串进行操作
		//m.group();获取匹配的子序列，但是此方法必须find一次才能够有效
		//故要使用循环去find()
		System.out.println(str+"\n\n");
		while(m.find()){
		System.out.println(m.group());
			System.out.println("字符区间：：："+m.start()+":"+m.end());
		}

	}

}
