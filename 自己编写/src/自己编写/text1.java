package �Լ���д;

import static net.mindview.util.Print.*;

public class text1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="hello world!";
		String b="My name is xujianglei!";
		String c="c";
		
		print("����="+a.length());
		
		print("��4λ�õ��ַ���"+a.charAt(4));//��һ���ַ����±�Ϊ0
		
		print("��Ӧ�Ĵ�дΪ��"+b.toUpperCase());//�����е�Сд��ĸΪ��д��ĸ
		
		print("�任�ַ���aΪ�ַ���b:"+a.replace("l", "n"));//���ַ���a�е�l��Ϊn
		
		print("��ȡa�ַ�����l�Ժ���ַ�����"+a.substring(2));
		
		print("��ȡhello��"+a.substring(0, 5));
		
		print("c�Ĺ�ϣ�룺"+c.hashCode());
		
		print("l��һ�γ��ֵ�λ�ã�"+a.indexOf("l"));
	}

}
