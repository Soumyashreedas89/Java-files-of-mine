class Multicatch1{
public static void main(String[]args){
try {
	int a[]=new int[5];
	a[5]=50/0;
}
catch(ArithmeticException e){
	System.out.println(Arithmetic Exception occurs);
}
catch(ArrayIndexOutOfBoundsException e){
	Systeem.out.println("Arrayindexoutofbounds Exception occurs");
}
catch(Exception e){
	System.out.println(parent Exception occurs);
}
System.out.println("Rest of the code");
}
}