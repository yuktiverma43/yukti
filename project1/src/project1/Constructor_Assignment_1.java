package project1;

public class Constructor_Assignment_1 
{
public Constructor_Assignment_1()
{
	this(1,2,3,4);
	System.out.println("Default Constructor");
}
public Constructor_Assignment_1(int a)
{
	this(1,2,3);
	System.out.println("One parameterized Constructor");
}
public Constructor_Assignment_1(int a, int b)
{
	this();
	System.out.println("Two parameterized Constructor");
}
public Constructor_Assignment_1(int a, int b, int c)
{
	this(1,2);
	System.out.println("Three parameterized Constructor");
}
public Constructor_Assignment_1(int a, int b, int c, int d)
{
	System.out.println("Four parameterized Constructor");
}
public static void main(String[] args) {
	Constructor_Assignment_1 obj = new Constructor_Assignment_1(3);
}
}
