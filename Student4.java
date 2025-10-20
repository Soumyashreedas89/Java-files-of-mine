class Student4{
int rollno;
string name;
string course;
float fee;
student4(int rollno,string name,string course,float fee);
  this.rollno=rollno;
  this.name=name;
  this.course=course;
  this.fee=fee;
}
Student4(int rollno,string name,string course,float fee);
this(rollno,course,name);
this.fee=fee;
}
void display()
{
	System.out.println(rollno+""+name+""+course+""+fee);
}
class TestThis3{
	public static void main (String[]args){
	Student4 st1=new Student4(040,"abhisek","java");
	Student4 st2=new Student(299,"soumya","java",6000f);
	st1.display();
	st2.display();
}
}