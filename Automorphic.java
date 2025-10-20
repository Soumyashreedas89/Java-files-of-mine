import java.util.Scanner;
class Automorphic{
	public static void main (String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number :");
		int num1=sc.nextInt();
		System.out.println("Enter the second number :");
		int num2=sc.nextInt();
		for( int i=1;i<=1000;i++){
			
			int sum=0;
			int digit=0;
			int n=m;
			while(m!=0){
				m=m/10;
				digit++;	
			
			}
			int square=n*n;
			int temp=(int)Math.pow(10,digit);
			int result=square%temp;
			if(n==result){
				System.out.println("Automorphic number :");
			}
			sc.close();
			}
	}
}