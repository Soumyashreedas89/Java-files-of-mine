abstract class Bike2{
abstract void run();
}
class Honda4 extends Bike2{
	void run(){
		System.out.println("running safely");
	}
}
	class Abstraction1{
	public static void main (String[]args){
		Bike2 obj=new Honda4();
		obj.run();
	}
}