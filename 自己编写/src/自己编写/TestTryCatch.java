package �Լ���д;

import java.util.Scanner;

public class TestTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		float k;
		Scanner scan=new Scanner(System.in);
		System.out.println("����i��j��");
		i=scan.nextInt();
		j=scan.nextInt();
		try{
			k=i/j;
		}catch(ArithmeticException e){
				System.out.print("��ĸjΪ0�������Ϲ淶��");
		}finally{
			if(j!=0){
			k=i/j;
			System.out.println(k);
			}
			else
			{
				System.out.println("������������������ ");
				i=scan.nextInt();
				j=scan.nextInt();
				k=i/j;
				System.out.println(k);
			}
		}
	}

}
