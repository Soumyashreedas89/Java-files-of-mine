import java.util.Scanner;
class Recct{
int length;
int width;
void insertData(int n, int m){
length=n;
width=m;
}
void displayArea(){

	System.out.println( "area="+(length* width));
}
}
class Main{
	public static void main(String[]args){
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter length: ");
		int 1=Sc.nextInt();
		System.out.println("Enter width:");
		int w=Sc.nextInt();
	Recct R1=new Recct();
	R1.insertData(1,w);
	R1.displayArea();
	} 	
}