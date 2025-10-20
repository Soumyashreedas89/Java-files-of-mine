class program2{
	static int count=0;
	program2()
	{
		count++;
	}
	void display(){
		System.out.println(count);
	}
	public static void main(String[]args){
	program2 p1=new program2();
	p1.display();
	program2 p2=new program2();
	p2.display();
	program2 p3=new program2();
	p3.display();
	//p1.display();
	//p2.display();
	//p3.display();
}
}