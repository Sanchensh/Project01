package Floor;

import java.util.Scanner;

public class Print {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("************************");
		System.out.println("         �ʻ���Ʒ��                ");
		System.out.println("************************");
		int sum=0//�����ܼ�Ǯ
			,cost=0;//����ÿ��ѡ����Ʒ����ܼ�Ǯ
		while(true){
			printFirst();//��ӡһ���˵�
			int i=scan.nextInt();
			switch (i) {
			case 1:
				cost=printSecond();
				break;
			case 2:
				cost=printThird();
				break;
			case 3:
				System.out.println("��һ��������"+sum+"Ԫ��");
				break;
			case 4:
				System.out.println("лл���٣�");
				System.exit(0);;
				break;
			default:
				printFirst();
				break;
			}
			sum+=cost;//�����ܼ�Ǯ
			cost=0;//ÿ�μ����ܼ�Ǯ֮�󽫾ֲ���Ǯ���㣬�����ظ�����
		}
	}
	public static void printFirst() {
		//��ӡһ���˵�
		System.out.println("1���ʻ�ѡ��");
		System.out.println("2����Ʒѡ��");
		System.out.println("3����ʼ����");
		System.out.println("4���˳�ϵͳ");
		System.out.println("������˵����:");
	}
	public static int printSecond() {
		//��ӡ�ʻ���Ϣ
		System.out.println("1��õ�廨����300��");
		System.out.println("2������ܰ����180��");
		System.out.println("3���װٺϣ���200��");
		System.out.println("������ѡ�����:");
		//ѡ���ʻ������ҽ��ʻ��۸����
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
		//ѡ��������
		System.out.println("�����빺������:");
		int j=scan.nextInt();
		//���ع����ʻ��໨�ѵļ�Ǯ
		return cost*j;
	}
	public static int printThird() {
		//��ӡ��Ʒ��Ϣ
		System.out.println("1�����ֺУ���258��");
		System.out.println("2��Hello Kitty���У���450��");
		System.out.println("3����ҵ��������456��");
		System.out.println("������ѡ�����:");
		//ѡ����Ʒ�����ҽ���Ʒ�۸����
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
		//ѡ����Ʒ��������
		System.out.println("�����빺������:");
		final int j=scan.nextInt();
		//���ع�����Ʒ���ܼ�Ǯ
		return cost*j;
	}
}
