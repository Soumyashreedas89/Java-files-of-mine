class A{
void print(int x){
System.out.println("int"+ x);
}
void print(double y){
	System.out.println("double"+ x);
}
void print(String x){
System.out.println("String"+ x);
}
class Methodoverloading{
	public static void main(String[]args){
	A ob1=new A();
	ob1.print(5);
	ob1.print(5.5);
	ob1.print("hello somu");
}
}