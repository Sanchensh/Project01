package Game21;

import static Game21.Calculate.*;
import java.util.Scanner;

public class Print {
	static Scanner scan=new Scanner(System.in);
	public static void printHead(){
		System.out.println("*************************豪华赌场之"+"\"决胜21点\""+"*************************");
		System.out.println("1、开始游戏每人发两张牌");
		System.out.println("2、玩家最多可以要3张牌");
		System.out.println("3、玩家停牌后由电脑选牌");
		System.out.println("4、A牌可以为1或11点，超过10点的牌计为10点，其他的牌按实际点数计算");
		System.out.println("5、谁先到21点或最接近21点算谁赢");
		System.out.println("6、闲家如果超过21点，则视为爆牌，直接输掉本局！");
		System.out.println("                       ////祝您好运\\\\\\\\                           ");
		System.out.println("**********************适度游戏益脑，沉迷游戏伤身************************");
		System.out.println("开始发牌，庄闲各两张牌......"+"\n");
	}
	
	//打印庄家信息
	public static void printZj(String card1,String card2,boolean bool){
		if(bool)
			System.out.println("庄家"+"\t"+"底牌"+"\t"+card1);
		else
			System.out.println("庄家底牌是:"+card2);
	}
	
	//打印闲家信息
	public static void printXj(String card1,String card2,String card3,String card4,String card5){
		System.out.println("闲家"+"\t"+card1+"\t"+card2+"\t"+card3+"\t"+card4+"\t"+card5+"  "+
				"点数:"+Sum(card1,card2,card3,card4,card5));
	}
	
	//打印选择项
	public static int printChose(){
		System.out.println("(1、要牌"+"\t"+"2、停牌)");
		int chose=scan.nextInt();
		return chose;
	}
	
	//打印结束
	public static void printGameOver(String card1,String card2,String card3,
			String card4,String card5,String card6,String card7){
		if(Sum(card1,card2,"","","")>Sum(card3,card4,card5,card6,card7)){
			System.out.println("庄家赢！");	
		}else if(Sum(card1,card2,"","","")==Sum(card3,card4,card5,card6,card7)){
			System.out.println("平局！");
		}else{
			System.out.println("闲家赢！");
		}
	}
	
	//打印是否再来一局
	public static boolean Continue(){
		boolean bool;
		System.out.println("是否再来一局？(1、是"+"\t"+"2、否)");
		int i=scan.nextInt();
		if(i==1){
			bool=true;
		}else{
			bool=false;
			System.out.println("*********************游戏结束！***********************");
		}
		return bool;
	}
	
	//判断是否爆牌
	public static boolean BaoCard(String card1,String card2,
			String card3,String card4,String card5){
		boolean bool=false;
		if(Sum(card1,card2,card3,card4,card5)>21){
			bool=true;
		}
		return bool;
	}
	
	//打印爆牌
	public static void printBao(){
		System.out.println("闲家爆牌，庄家赢！");
	}
}