interface Drawable{
	void draw();
}
class Rectangle implements Drawable{
	public void draw(){
		System.out.println("drawing rectangle");
	}
}
class Circle implements Drawable{
	public void draw(){
		System.out.println("drawing circle");
		
	}
}

class A10{
	public static void main (String[]args){
		Drawable d1=new Circle();
		getDrawable()
		d1.draw();
		}
	}
