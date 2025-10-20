class Student{
int roll;
String name;
void insertData(int n,String s)
{
	roll=n;
	name=s;	
}

void displayInfo()
{
	System.out.println(roll +""+ name);
}
}
class Main{
	public static void main(String[]args){
	Student S1=new Student();
	Student S2=new Student();
	S1.insertData(299,"soumya");
	S2.insertData(40,"Abhisek");
	S1.displayInfo();
	S2.displayInfo();
}
}
