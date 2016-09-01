package Game21;

public class Calculate {
	public static int No(String card){
		int count=0;
		if(card.endsWith("A")){
			count=11;
		}else if(card.endsWith("2")){
			count=2;
		}else if(card.endsWith("3")){
			count=3;
		}else if(card.endsWith("4")){
			count=4;
		}else if(card.endsWith("5")){
			count=5;
		}else if(card.endsWith("6")){
			count=6;
		}else if(card.endsWith("7")){
			count=7;
		}else if(card.endsWith("8")){
			count=8;
		}else if(card.endsWith("9")){
			count=9;
		}else if(card.endsWith("10")||card.endsWith("J")||card.endsWith("Q")||card.endsWith("K")){
			count=10;
		}
		return count;
	}
	public static int Sum(String card1,String card2,String card3,String card4,String card5){
		int count=0;
		int i=0,sum=0;
		if(card1.endsWith("A")||card2.endsWith("A")||card3.endsWith("A")||card4.endsWith("A")||card5.endsWith("A")){
			if(card1.endsWith("A"))
				i++;
			if(card2.endsWith("A"))
				i++;
			if(card3.endsWith("A"))
				i++;
			if(card4.endsWith("A"))
				i++;
			if(card5.endsWith("A"))
				i++;
			sum=No(card1)+No(card2)+No(card3)+No(card4)+No(card5);
			while(sum>21&&i>0){
				sum-=10;
				i--;
			}
			count=sum;
		}else{
			count=No(card1)+No(card2)+No(card3)+No(card4)+No(card5);
		}
		return count;
	}
}