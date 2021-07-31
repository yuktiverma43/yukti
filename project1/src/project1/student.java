package project1;

public class student 
{
int age;
int rollNo;


public void dispaly1()
{
	System.out.println("Welcome all of you");
}

public void display2()
{
	System.out.println("Automation is very easy");
}

public static void main(String[] args) 
{
  student abc=new student();
  abc.age=32;
  abc.rollNo=30;
  System.out.println(abc.age);
  System.out.println(abc.rollNo);
  abc.dispaly1();
  abc.display2();
}
}
