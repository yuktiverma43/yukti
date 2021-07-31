package project1;

public class Method_Assisgnment_1 
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
	Method_Assisgnment_1 obj = new Method_Assisgnment_1();
	int sum_result = obj.sum(10, 2);
	int sum_result1 = obj.sum(sum_result, 2);
	int minus_result = obj.minus(sum_result1, 2);
	int multiply_result = obj.multiply(minus_result, 2);
	int divide_result = obj.divide(multiply_result, 2);
	System.out.println("final result" + divide_result);
}
}