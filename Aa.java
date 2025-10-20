
//super can be used to invoke parent class method
class Aa{
void m(){
	
	System.out.println("I am a method of class Aa");
}
}
class Bb extends Aa{
	void m(){
		super.m();
	System.out.println("I am a method of class Bb");	
	}
	void n(){
		System.out.println("I am another method of class Bb");
	}
}
class Test{
	public static void main(String[]args){
		Bb b1=new  Bb();
		b1.m();
		b1.n();
	}
}