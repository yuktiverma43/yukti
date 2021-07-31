package project1;

public class Super_Constructor_1 
{
	public Super_Constructor_1()
	{
		this(1,2,3);
		System.out.println("Parent default constructor");
	}
	public Super_Constructor_1(int a)
	{
		this();
		System.out.println("Parent one parameterized constructor");
	}
	public Super_Constructor_1(int a,int b)
	{
		this(1);
		System.out.println("Parent two parameterized constructor");
	}
	public Super_Constructor_1(int a,int b,int c)
	{
		System.out.println("Parent three parameterized constructor");
	}
	public Super_Constructor_1(int a,int b,int c, int d)
	{
		this(1,2);
		System.out.println("Parent four parameterized constructor");
	}
}
