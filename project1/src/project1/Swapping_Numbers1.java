package project1;

import java.util.Scanner;

public class Swapping_Numbers1
{
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter value of a" + ","+ "b");
	int a =s.nextInt();
	int b=s.nextInt();
	System.out.println("Before swapping " + a +"," + b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swapping" + a +"," + b);
}
}
