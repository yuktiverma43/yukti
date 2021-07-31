package project1;

public class Constructor_Method_Assignment2
{
	public void m1()
	{
		System.out.println("Default Constructor");
	}
	public void m2()
	{
		System.out.println("One parameterized Constructor");
	}
	public void m3()
	{
		System.out.println("Two parameterized Constructor");
	}
	public void m4()
	{
		this.m5();
		this.m1();
		this.m3();
		this.m2();
		System.out.println("Three parameterized Constructor");
	}
	public void m5()
	{
		System.out.println("Four parameterized Constructor");
	}
	public static void main(String[] args)
	{
		Constructor_Method_Assignment2 obj = new Constructor_Method_Assignment2();
		obj.m4();
	}
}
