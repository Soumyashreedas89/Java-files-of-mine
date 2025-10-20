class Animal{
	void eat(){
		System.out.println("Animals eat food");
	}
}
class Dog extends Animal{
	void bark(){
		System.out.println("Dog barks");
	}
}
class Puppy extends Dog{
	void weep(){
		System.out.println("puppy weeps");
	}
}
	class Multilevel{
	public static void main(String[]args){
		Puppy P1=new Puppy();
		P1.eat();
		P1.bark();
		P1.weep();
	}
}