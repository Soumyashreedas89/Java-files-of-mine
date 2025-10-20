//super is used to invoke parent class constructor
class Animal4{
Animal4()
{
System.out.println("Animal is dancing");
}
}
class Dog extends Animal4{
	Dog(){
		super();
		System.out.println("Dog is is singing");
	}
}
class Test4{
public static void main(String[]args){
	Dog d=new Dog();
}
}