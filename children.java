import java.util.Scanner;
class children{
	static int count=0;
	children()
	{
		count++;
	}
	void display()
	{
		System.out.println(count);
	}
	public static void main(String[]args){
		children c1=new children();
		c1.display();
		children c2=new children();
		c2.display();
		children c3=new children();
		c3.display();
		
	}
}   