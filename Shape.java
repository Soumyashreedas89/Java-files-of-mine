import java .util.Scanner;
public class Shape{
	void draw()
	{
		System.out.println("drawing");
	}
}
class Rectangle extends Shape{
	void draw(){
		System.out.println("drawing Rectangle.......");
	}
}
class circle extends Shape{
	void draw(){
		System.out.println("drawing circle............ ");
	}
}
class triangle extends Shape{
	void draw(){
		System.out.println("drawing triangle.........");
	}
}
class polymorphism{
	public static void main(String[]args){
		Shape s;
		s=new Rectangle();
		s.draw();
		s=new circle();
		s.draw();
		s=new triangle();
		s.draw();
	}
}