package project1;

public class Method_Assignment_2 
{
	
	public int sum(int a, int b)
	{
		int c= a+b;
	System.out.println("sum is"+ c);
	return c;
}

	public int minus(int a, int b)
	{
		int c= a-b;
	System.out.println("minus is"+ c);
	return c;
}

	public int multiply(int a, int b)
	{
		int c= a*b;
	System.out.println("multiply is"+ c);
	return c;
}

	public int divide(int a, int b)
	{
		int c= a/b;
	System.out.println("divide is"+ c);
	return c;
}
public static void main(String[] args)
{
	Method_Assignment_2 obj = new Method_Assignment_2();
	int multiply_result = obj.multiply(10, 2);
	int minus_result = obj.minus(multiply_result, 2);
	int sum_result = obj.sum(minus_result, 2);
	int minus_result1 = obj.minus(sum_result, 2);
	int divide_result = obj.divide(minus_result1, 2);
	System.out.println("final result" + divide_result);
}
}