package ×Ô¼º±àÐ´;
import java.util.Random;
public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random(47);
		float[] f=new float[10];
		for(int i=0;i<10;i++){
			f[i]=rand.nextFloat();	
		for(float x:f)
			System.out.println(x);
		for(char c:"adb".toCharArray())
			System.out.print(c);
		}
	}

}
