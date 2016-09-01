package 自己编写;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=0;
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					if(i!=j&&j!=k&&i!=k){
						System.out.println("不重复的数是:"+(i*100+j*10+k));
						m++;
					}
				}
			}
		}
		System.out.println(m);
	}

}
