class Methodoverloading3{
int add(int x,int y){
  int z=x+y;
   return z;
}
int add(int x,int y,int z){
	int sum=x+y+z;
	return sum;
}
}
class A{
public static void main (String[]args){
Methodoverloading3 ob1=new Methodoverloading3();
int z=ob1.add(10,20);
System.out.println(z);
int sum= ob1.add(10,20,30);
System.out.println(sum);
}
}