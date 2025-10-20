abstract class Bank2{
abstract int getrateofintrest();
}
class SBI extends Bank2{
	int getrateofintrest(){
		return 7;
	}
}
class PNB extends Bank2{
	int getrateofintrest(){
		return 8;
	}
}
class TestBank2{
	public static void main (String[]args){
		Bank2 b2=new SBI();
		System.out.println("Rate of intrest is":+b2.getrateofintrest()+"%");
		Bank2 b2=new PNB();
		System.out.println("Rate of intrest is":+b2.getrateofintrest()+"%");
		
	}
}