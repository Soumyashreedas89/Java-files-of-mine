class Rect{
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
	Rect R1=new Rect();
	R1.insertData(5,6);
	R1.displayArea();
	} 	
}