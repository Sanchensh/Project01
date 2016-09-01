package Floor;

import java.util.Scanner;

public class Print {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("************************");
		System.out.println("         鲜花礼品网                ");
		System.out.println("************************");
		int sum=0//定义总价钱
			,cost=0;//定义每次选择商品后的总价钱
		while(true){
			printFirst();//打印一级菜单
			int i=scan.nextInt();
			switch (i) {
			case 1:
				cost=printSecond();
				break;
			case 2:
				cost=printThird();
				break;
			case 3:
				System.out.println("您一共花费了"+sum+"元！");
				break;
			case 4:
				System.out.println("谢谢光临！");
				System.exit(0);;
				break;
			default:
				printFirst();
				break;
			}
			sum+=cost;//计算总价钱
			cost=0;//每次计算总价钱之后将局部价钱清零，避免重复计算
		}
	}
	public static void printFirst() {
		//打印一级菜单
		System.out.println("1、鲜花选购");
		System.out.println("2、礼品选购");
		System.out.println("3、开始结账");
		System.out.println("4、退出系统");
		System.out.println("请输入菜单编号:");
	}
	public static int printSecond() {
		//打印鲜花信息
		System.out.println("1、玫瑰花（￥300）");
		System.out.println("2、康乃馨（￥180）");
		System.out.println("3、白百合（￥200）");
		System.out.println("请输入选购编号:");
		//选择鲜花，并且将鲜花价格给出
		int i=scan.nextInt();
		int cost=0;
		switch (i) {
		case 1:
			cost=300;
			break;
		case 2:
			cost=180;
			break;
		case 3:
			cost=200;
			break;
		default:
			printSecond();
			break;
		}
		//选择购买数量
		System.out.println("请输入购买数量:");
		int j=scan.nextInt();
		//返回购买鲜花多花费的价钱
		return cost*j;
	}
	public static int printThird() {
		//打印礼品信息
		System.out.println("1、音乐盒（￥258）");
		System.out.println("2、Hello Kitty公仔（￥450）");
		System.out.println("3、开业花篮（￥456）");
		System.out.println("请输入选购编号:");
		//选择物品，并且将物品价格给出
		int i=scan.nextInt();
		int cost=0;
		switch (i) {
		case 1:
			cost=258;
			break;
		case 2:
			cost=450;
			break;
		case 3:
			cost=456;
			break;
		default:
			printThird();
			break;
		}
		//选择物品购买数量
		System.out.println("请输入购买数量:");
		final int j=scan.nextInt();
		//返回购买物品的总价钱
		return cost*j;
	}
}
