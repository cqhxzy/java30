package job;

public class Test2 {

	public static void main(String[] args) {
		String str[] = {"AAA","AAB","AAA","AAC","AAC","AAC","BBC","BBD","AAC","DBB","AAE","AAD"};
		for (int i = 0; i < str.length; i++) {
			
			String target = str[i]; //每次循环的参照物
			
			if (target == null) {  //这一步不能省略
				continue;
			}
			
			for (int j = i + 1; j < str.length; j++) {
				/*
				 * 比较两个字符串是否相同不能使用==
				 * 因为String是引用数据类型，==比较引用数据类型时比较的是内存地址
				 * 基本数据类型使用==比较值
				 * 
				 * String通过方法equals来比较字符串的内容
				 * */
				if (target.equals(str[j])) {
					str[j] = null;
				}
			}
		}
		
		for (int i = 0; i < str.length; i++) {
			if (str[i] == null) {
				continue;
			}
			System.out.println(str[i]);
		}
		
	}

}
