class parentclass{
	int a;
	parentclass(int x);
	{
		a=x;
	}
}
class childclass extends parentclass{
	int b;
	childclass(int x,int y);
	{
		super(x);
		b=y;
	}
	void show(){
		System.out.println("value of a:"+a+"\n value of b:"+b);
	}
}
public class orderexecuted{
public static void main (String[]args){
	System.out.println("order of constructor execution..");
	childclass d=new childclass(78,89);
	d.show();
}
}