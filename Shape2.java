abstract class Shape2{
 abstract void draw();
}
class Rectangle extends Shape2{
	void draw(){
		System.out.println("drawing rectangle");
	}
}
class Circle extends Shape2{
	void draw(){
		System.out.println("drawing circle");
	}
}
class Testabstarction2{
	public static void main (String[]args){
		Shape2 s=new Circle();
		s.draw();
	}
}