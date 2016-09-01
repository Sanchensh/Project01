package 自己编写;

import java.util.Scanner;

public class TestTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		float k;
		Scanner scan=new Scanner(System.in);
		System.out.println("输入i和j：");
		i=scan.nextInt();
		j=scan.nextInt();
		try{
			k=i/j;
		}catch(ArithmeticException e){
				System.out.print("分母j为0，不符合规范，");
		}finally{
			if(j!=0){
			k=i/j;
			System.out.println(k);
			}
			else
			{
				System.out.println("请重新输入两个数： ");
				i=scan.nextInt();
				j=scan.nextInt();
				k=i/j;
				System.out.println(k);
			}
		}
	}

}
