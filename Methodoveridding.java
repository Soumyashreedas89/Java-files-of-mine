class Methodoveridding{
void m(){
	System.out.println("i am a parent class");
}
}
class child extends Methodoveridding{
	void m(){
		System.out.println("i am a child class");
	}
}
class Program1{
	public static void main(String[]args){
		Program1 P1=new child();
	}
}