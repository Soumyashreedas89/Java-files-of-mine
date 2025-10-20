//super keyword use as a method
class Father{
int x=10;
}
class Child extends Father{
	int x=30;
	void m()
	{
		System.out.println("x:"+x);
		System.out.println("x:"+super.x);
	}
}
class Program2{
	public static void main(String[]args){
		Child c=new Child();
		c.m();
	}
}
