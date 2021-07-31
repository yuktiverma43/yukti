package project1;

import java.util.Scanner;

public class Scanner_Assignment_2 
{
 public int sum(int a, int b)
 {
	 int c = a+b;
	 return c;
 }
 public int sub(int a, int b)
 {
	 int c = a-b;
	 return c;
 }
 public int multiply(int a, int b)
 {
	 int c= a*b;
	 return c;
 }
 public int divide(int a, int b)
 {
	 int c= a/b;
	 return c;
 }
 public static void main(String[] args)
 {
	 Scanner_Assignment_2 obj = new Scanner_Assignment_2();
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter value of X1 ");
	 int X1 =s.nextInt();
	 System.out.println("Enter value of X2 ");
	 int X2= s.nextInt();
	 int multi_result = obj.multiply(X1, X2);
	 System.out.println("Multiply is " + multi_result);
	 System.out.println("Enter value of X3 ");
	 int X3= s.nextInt();
	 int sub_result = obj.sub(multi_result, X3);
	 System.out.println("sub is "+ sub_result);
	 System.out.println("Enter value of X4 ");
	 int X4 = s.nextInt();
	 int sum_result =obj.sum(sub_result, X4);
	 System.out.println("sum is " + sum_result);
	 System.out.println("Enter value f X5");
	 int X5 = s.nextInt();
	 int sub_result1=obj.sub(sum_result, X5);
	 System.out.println("sub is "+ sub_result1);
	 System.out.println("Enter value of X6");
	 int X6= s.nextInt();
	 int divide_result=obj.divide(sub_result1, X6);
	 System.out.println("divide is " + divide_result);
 }
}
