abstract class Bike3{
Bike3(){
System.out.println("bike is created");}
abstract void run();
void changeGear()
{
System.out.println("gear changed");
}
}
class Honda extends Bike3{
	void run(){
		System.out.println("running safely");
	}
}
class Testabstraction2{
	public static void main(String[]args){
		Bank obj=new Honda();
		obj.run();
		obj.changegear();
	}
}