class A{
	void show(){
	System.out.println("i am parent");
	}
}
	class B extends A{
		void display(){
			System.out.println("i am child");
		}
	}
	class Inheritance{
		public static void main(String[]args){
			B ob1=new B();
			ob1.display();
			ob1.show();
			
		}
	}
