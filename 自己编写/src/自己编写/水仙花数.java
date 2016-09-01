package 自己编写;

public class 水仙花数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++){
			for(int j=0;j<=9;j++){
				for(int k=0;k<=9;k++){
					for(int n=0;n<=9;n++){
					if(i*i*i*i+j*j*j*j+k*k*k*k+n*n*n*n==i*1000+j*100+k*10+n)
						System.out.println(i*1000+j*100+k*10+n+"是水仙花数！");
					}
				}
			}
		}
	}

}
