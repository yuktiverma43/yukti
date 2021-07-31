package project1;

import java.util.Scanner;

public class armstrong_number 
{
public static void main(String[] args) 
{
	Scanner s = new Scanner(System.in);
	int number = s.nextInt();
	System.out.println("Enter a number ");
	int originalNumber, result=0, remainder;
    originalNumber = number;
	while(originalNumber != 0)
	{
        remainder = originalNumber % 10;
        result += Math.pow(remainder, 3);
        originalNumber /= 10;
    }

    if(result == number)
        System.out.println(number + " is an Armstrong number.");
    else
        System.out.println(number + " is not an Armstrong number.");
}
}
