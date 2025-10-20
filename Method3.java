class Method3{
static int multiply(int x,int y){
 int z=x*y;
return z;
}
static int multiply(int x,int y,int z){
  int result=x*y*z;
  return  result;
}
}
class Program1{
	public static void main (String[]args){
		System.out.println(Method3.multiply(2,4));
		System.out.println(Method3.multiply(2,9,3));
		
	}
}