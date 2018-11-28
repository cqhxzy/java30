package job;

public class Test {

	public static void main(String[] args) {
		String str = "azbaccdeff";
		for (int i = 0; i < str.length(); i++) {
			//每次循环获取下标为i的字符
			/*
			 * 接收用户输入性别
			 * input.next().charAt(0);
			 * input.next()
			 * */
			char target = str.charAt(i);  //获取字符串索引为i的字符
			boolean flag = true; //假设当前这个字符是第一次出现过一次的字符
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(j) == target) {
					flag = false;//这个字符重复出现
					break;
				}
			}
			if (flag) {
				System.out.println("str中第一个出现过一次的字符：" + target);
				break;
			}
		}
	}

}
