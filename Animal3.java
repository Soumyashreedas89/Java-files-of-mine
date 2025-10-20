
class Animal3{
	void eat(){
		System.out.println("eating...");
	}
}
class Dog3 extends Animal3{
	voiod eat(){
		System.out.println("eating bread..");
	}
	void bark(){
		System.out.println("barking..");
	}
	void work(){
			super.eat();
			bark();
		}
}
	
class Test{
	public static void main(String[]args){
		Dog d=new DOg();
		d.work();
	}	

}