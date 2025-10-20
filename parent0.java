//call parameterized constructor using super()
class parent{
parent(){
System.out.println("i am a parent class");
}
parent(String s){
System.out.println("i am parent class constructor"+s);
}
}
class child extends parent{
	child(){
		super("parameterized");
		System.out.println("i am child class constructor");
	}
}
class constant{
	public static void main(String[]args){
		child ob1=new child();
	}
}