class Method2
{
	void add(int x,int y){
		int z=x+y;
		System.out.println(z);
	}
	void add(int x,int y,int z){
		int sum=x+y+z;
		System.out.println(sum);
	}
	class A{
		public static void main(String[]args){
			Method2 ob1=new Method2();
			ob1.add(10,20);
			ob1.add(10,20,30);
		}
	}
	}
