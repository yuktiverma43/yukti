package project1;

import java.util.Scanner;

public class factorialNumber 
{
public static void main(String[] args)
{
	int i,fact=1;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number");
	int number = s.nextInt();
	
	for(i=1;i<=number;i++)
	{
		fact=fact*i;
	}
		System.out.println("Factoial of number is" + fact);
	}
}

