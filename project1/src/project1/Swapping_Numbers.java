package project1;

import java.util.Scanner;

public class Swapping_Numbers
{

public static void main(String[] args)
{
	int var3;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter value of var1  and var2");
	int var1 = s.nextInt();
	int var2 = s.nextInt();
	System.out.println("Before swapping" + var1 +","+ var2);
	var3=var1;
	var1=var2;
	var2=var3;
	System.out.println("After swapping" + var1 +"," + var2);
}
}