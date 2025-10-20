import java.util.*;{
import java.util.scanner;
public class arm
{
public static void main(String[]args){
Scanner sc=new Scanner(System.in)	;
int n;
System.out.println("enter a number:");
n=sc.nextInt();
int digit=0;
int temp=0;
int sum=0;
temp=n;
while(t!=0)
{
	temp=temp/10;
	digit++;
}
System.out.println("digit="+digit);
temp=n;
while(temp!=0)
{
	int r=temp%10;
	sum=sum+(int)Math.pow(r,digit);
	temp=temp/10;
}
if(sum==n){
	System.out.println("thhe no .is armstrong");
}
}
}