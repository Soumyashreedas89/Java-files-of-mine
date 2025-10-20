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
class Puppy extends Animal{
	void weep(){
		System.out.println("puppy weeps");
	}
}
	class Hirerachical{
	public static void main(String[]args){
		Puppy P1=new Puppy();
		P1.weep();
		Dog D1=new Dog();
		D1.bark();
}
	}