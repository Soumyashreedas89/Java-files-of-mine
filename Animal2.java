// invoke parent class instance variable
class Animal2{
	String color="white";
}
class Dog extends Animal2{
 String color="black";
 void printColor(){
	 System.out.println(color);
	 System.out.println(super.color);
 }
}
class Test2{
	public static void main(String[]args){
		Dog d=new Dog();
		d.printColor();
	}
}