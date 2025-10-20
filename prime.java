import java.util.Scanner;
class prime{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int f=0;
		for(int i=2;i<num-1;i++)
		{
			if(num%i==0)
			{
				f=1;
				break;
			}
		}
		if(f==0)
			System.out.println("number is prime");
		else
			System.out.println("number is not prime");
	}
}