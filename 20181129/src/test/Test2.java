package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {

	/*
	 * 1 6
	 * 00010110
	 *        2 + 4 +16
	 * */
	public static final int LEN = 0x16;
	
	public static void main(String[] args) {
		String regex = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]{2,}(-[a-z0-9A-Z]+){0,}\\.)(cn|com|com\\.cn)$";
		boolean result = validate(regex,"ab@163.com.cn");
		System.out.println(result ? "邮箱合法！" : "邮箱不合法!");
	}

	/**
	 * 根据正则表达式验证字符串是否合法
	 * @param regex 正则表达式
	 * @param content 要验证的内容
	 * @return
	 */
	private static boolean validate(String regex,String content) {
		Pattern p = Pattern.compile(regex); //编译正则表达式
		Matcher m = p.matcher(content);
		boolean result = m.matches();	//匹配判断，让正则表达式工作
		return result;
	}
	
	

}
