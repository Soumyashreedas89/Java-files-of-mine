//runtime polymorphism with data member
public class Bike{
	int speedlimit=90;
}
class Honda3 extends Bike{
	int speedlimit=150;
}
public  Static void main(String[]args){
	Bike obj=new Honda3();
	System.out.println(b1.speedlimit);
}