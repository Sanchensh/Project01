package Game21;

import static Game21.Print.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
	public static void Start(){
		printHead();//��ӡ�Ի�����
		do{
			boolean bool=true;
			String[] card=Card();
			
			//��ʼʱ��ׯ�����ҵ�����
			printZj(card[0],card[1],bool);
			printXj(card[2],card[3],"","","");
			
			//��һ��ѡ��
			if(printChose()==2){
				printZj(card[0],card[1],!bool);
				printGameOver(card[0],card[1],card[2],card[3],"","","");
				if(Continue())
					continue;
				else
					break;
			} else {
				printZj(card[0],card[1],bool);
				printXj(card[2],card[3],card[4],"","");
				if(BaoCard(card[2],card[3],card[4],"","")){
					printBao();
					if(Continue())
						continue;
					else
						break;
				}
			}
			
			//�ڶ���ѡ��
			if(printChose()==2){
				printZj(card[0],card[1],!bool);
				printGameOver(card[0],card[1],card[2],card[3],card[4],"","");
				if(Continue())
					continue;
				else
					break;
			}else{
				printZj(card[0],card[1],bool);
				printXj(card[2],card[3],card[4],card[5],"");
				if(BaoCard(card[2],card[3],card[4],card[5],"")){
					printBao();
					if(Continue())
						continue;
					else
						break;
				}
			}
			
			//������ѡ��
			if(printChose()==2){
				printZj(card[0],card[1],!bool);
				printGameOver(card[0],card[1],card[2],card[3],card[4],card[5],"");
				if(Continue())
					continue;
				else
					break;
			}else{
				printZj(card[0],card[1],!bool);
				printXj(card[2],card[3],card[4],card[5],card[6]);
				if(BaoCard(card[2],card[3],card[4],card[5],card[6])){
					printBao();
					if(Continue())
						continue;
					else
						break;	
					}
				printGameOver(card[0],card[1],card[2],card[3],card[4],card[5],card[6]);
				if(Continue())
					continue;
				else
					break;
			}
		}while(true);
	}
	private static String[] Card(){
		//����52����
		ArrayList<String>card=new ArrayList<String>();
		String[]s1=new String[4];
		String[]s2=new String[13];
		String[]s3=new String[7];
		s1[0]="����";s1[1]="����";s1[2]="÷��";s1[3]="����";
		s2[0]="A";s2[1]="2";s2[2]="3";s2[3]="4";s2[4]="5";
		s2[5]="6";s2[6]="7";s2[7]="8";s2[8]="9";s2[9]="10";
		s2[10]="J";s2[11]="Q";s2[12]="K";
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				card.add(s1[i]+s2[j]);
			}
		}
		//ѡ��7��ͬ������
		int size=card.size();
		for (int j = 0; j<s3.length;j++,size--){
			Random rand=new Random();
			int i=rand.nextInt(size);
			//�õ������Ƶ�ͬʱɾ�������ƣ������ظ�
			s3[j]=getCard(card,i);
			card=deleteCard(card, i);
			}
		return s3;
	}
	private static String getCard(ArrayList<String> card,int index){
		return card.get(index);
		}
	private static ArrayList<String> deleteCard(ArrayList<String> card ,int index){
		card.remove(index);
		return card;
		}
}