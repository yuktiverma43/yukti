package project1;

public class Super_Constructor_2 extends Super_Constructor_1
{
	public Super_Constructor_2()
	{
		this(1,2,3,4);
		System.out.println("Child default constructor");
	}
	public Super_Constructor_2(int a)
	{
		this();
		System.out.println("Child one parameterized constructor");
	}
	public Super_Constructor_2(int a,int b)
	{
		
		this(1,2,3);
		System.out.println("Child two parameterized constructor");
	}
	public Super_Constructor_2(int a,int b,int c)
	{
		this(1);
		System.out.println("Child three parameterized constructor");
	}
	public Super_Constructor_2(int a,int b,int c, int d)
	{
		super(1,2,3,4);
		System.out.println("Child four parameterized constructor");
	}
	public static void main(String[] args) 
	{
		Super_Constructor_2 obj = new Super_Constructor_2(1,2);
		
	}
}
