class th2{
	void m(){
		System.out.println(" hii somya");
	}
	void n(){
		System.out.println("hello");//m();//inside n,you call m
		this.m();
	}
	public static void main(String[]args){
		new th2().n();
	}
}