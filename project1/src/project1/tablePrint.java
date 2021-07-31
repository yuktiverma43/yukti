package project1;

import java.util.Scanner;

public class tablePrint
{

public static void main(String[] args)
{
	int i;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number ");
	int number = s.nextInt();
	for (i=1; i <=10;i++)
	{
		System.out.println(number + " * " + i + " = "
                + number*i);
	}
}
}
