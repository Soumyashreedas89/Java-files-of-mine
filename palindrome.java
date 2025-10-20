import java.util.Scanner;
class palindrome{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int temp=num;
int reverse=0;
while(num!=0)
{
	int rem=num%10;
	reverse=reverse*10+rem;
	num=num/10;
	
}
System.out.println("reverse number is "+reverse);
if(temp==reverse)
	System.out.println("reverse number is palindrom");
else
	System.out.println("reverse is not palindrom");
}
}