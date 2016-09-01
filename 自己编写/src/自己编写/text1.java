package 自己编写;

import static net.mindview.util.Print.*;

public class text1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="hello world!";
		String b="My name is xujianglei!";
		String c="c";
		
		print("长度="+a.length());
		
		print("第4位置的字符："+a.charAt(4));//第一个字符的下标为0
		
		print("对应的大写为："+b.toUpperCase());//改所有的小写字母为大写字母
		
		print("变换字符串a为字符串b:"+a.replace("l", "n"));//把字符串a中的l改为n
		
		print("截取a字符串中l以后的字符串："+a.substring(2));
		
		print("截取hello："+a.substring(0, 5));
		
		print("c的哈希码："+c.hashCode());
		
		print("l第一次出现的位置："+a.indexOf("l"));
	}

}
