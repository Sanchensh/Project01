package Game21;

import static Game21.Calculate.*;
import java.util.Scanner;

public class Print {
	static Scanner scan=new Scanner(System.in);
	public static void printHead(){
		System.out.println("*************************�����ĳ�֮"+"\"��ʤ21��\""+"*************************");
		System.out.println("1����ʼ��Ϸÿ�˷�������");
		System.out.println("2�����������Ҫ3����");
		System.out.println("3�����ͣ�ƺ��ɵ���ѡ��");
		System.out.println("4��A�ƿ���Ϊ1��11�㣬����10����Ƽ�Ϊ10�㣬�������ư�ʵ�ʵ�������");
		System.out.println("5��˭�ȵ�21�����ӽ�21����˭Ӯ");
		System.out.println("6���м��������21�㣬����Ϊ���ƣ�ֱ��������֣�");
		System.out.println("                       ////ף������\\\\\\\\                           ");
		System.out.println("**********************�ʶ���Ϸ���ԣ�������Ϸ����************************");
		System.out.println("��ʼ���ƣ�ׯ�и�������......"+"\n");
	}
	
	//��ӡׯ����Ϣ
	public static void printZj(String card1,String card2,boolean bool){
		if(bool)
			System.out.println("ׯ��"+"\t"+"����"+"\t"+card1);
		else
			System.out.println("ׯ�ҵ�����:"+card2);
	}
	
	//��ӡ�м���Ϣ
	public static void printXj(String card1,String card2,String card3,String card4,String card5){
		System.out.println("�м�"+"\t"+card1+"\t"+card2+"\t"+card3+"\t"+card4+"\t"+card5+"  "+
				"����:"+Sum(card1,card2,card3,card4,card5));
	}
	
	//��ӡѡ����
	public static int printChose(){
		System.out.println("(1��Ҫ��"+"\t"+"2��ͣ��)");
		int chose=scan.nextInt();
		return chose;
	}
	
	//��ӡ����
	public static void printGameOver(String card1,String card2,String card3,
			String card4,String card5,String card6,String card7){
		if(Sum(card1,card2,"","","")>Sum(card3,card4,card5,card6,card7)){
			System.out.println("ׯ��Ӯ��");	
		}else if(Sum(card1,card2,"","","")==Sum(card3,card4,card5,card6,card7)){
			System.out.println("ƽ�֣�");
		}else{
			System.out.println("�м�Ӯ��");
		}
	}
	
	//��ӡ�Ƿ�����һ��
	public static boolean Continue(){
		boolean bool;
		System.out.println("�Ƿ�����һ�֣�(1����"+"\t"+"2����)");
		int i=scan.nextInt();
		if(i==1){
			bool=true;
		}else{
			bool=false;
			System.out.println("*********************��Ϸ������***********************");
		}
		return bool;
	}
	
	//�ж��Ƿ���
	public static boolean BaoCard(String card1,String card2,
			String card3,String card4,String card5){
		boolean bool=false;
		if(Sum(card1,card2,card3,card4,card5)>21){
			bool=true;
		}
		return bool;
	}
	
	//��ӡ����
	public static void printBao(){
		System.out.println("�мұ��ƣ�ׯ��Ӯ��");
	}
}