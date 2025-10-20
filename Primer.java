import java.util.Scanner;
class Primer{
	public static void main(String[]args){
		int n;
		int i;
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number n :");
		 n=sc.nextInt();
		for( i=1;i<n;i++){
			int flag=0;
			
			for(int j=2;j<i;j++)
			{
			
				
				if(i%j==0){
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println(i+" ");
				sum=sum+i;
				
			}
		}
		System.out.println("sum:"+sum);
		
	}
}