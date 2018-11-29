package test;

public class Test6 {

	public static void main(String[] args) {
		String str="我我...我...我我...我喜....喜喜喜....喜喜...喜欢欢..欢欢..欢...欢亮亮亮...亮...亮哥";
		//替换重复的.
		str = str.replaceAll("\\.{1,}", "");
		//System.out.println(str);
		
		//替换叠词
		str = str.replaceAll("(.)\\1+", "$1");
		System.out.println(str);
	}

}
