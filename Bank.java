//example of Runtime Polymorphism
class Bank{
float getRateofIntrest(){
return 0;
}
}
class SBI extends Bank{
float getRateofIntrest(){
	return 8.4f;	
	}
}
class ICICI extends Bank{
float getRateofIntrest(){
	return 7.3f;
}
}
class AXIS extends Bank{
float getRateofIntrest(){
	return 9.7f;
}
}
class Testpolymorphism{
	public static void main(String[]args){
		Bank b;
		b=new SBI();
		System.out.println("SBI Rate of Intrest:"+b.getRateofIntrest());
		b=new ICICI();
		System.out.println(" ICICI Rate of Intrest:"+b.getRateofIntrest()); 
		b=new AXIS();
        System.out.println("AXIS Rate of Intrest:"+b.getRateofIntrest());		
		}
}