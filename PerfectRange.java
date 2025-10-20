import java .util.Scanner;
class PerfectRange{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number:");
	int num1=sc.nextInt();
	System.out.println("Enter the second number:");
	int num2=sc.nextInt();
	int n=1000;
	int m=n;
	for(int i=1;i<=m/2;i++){
		int sum=0;
		for(int j=1;j<i;j++){
			if(i%j==0){
				sum=sum+j;
			}
			
		}
		if(sum==i){
			System.out.println(i);
		}
	}
	sc.close();
	}
}