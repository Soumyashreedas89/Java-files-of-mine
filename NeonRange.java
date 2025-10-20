import java.util.Scanner;
class NeonRange{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		System.out.println("Enter the second number:");
		int num2=sc.nextInt();
		for(int i =num1;i<num2;i++){
			int m=i*i;
			int sum=0;
			while(m!=0)
			{
				int r=m%10;
				sum=sum+r;
				m=m/10;
			}
			if(sum==i){
				System.out.println(i+"is a Neon number");
			}
		}
		sc.close();
	}
}