package project1;

import java.util.Scanner;

public class Palindrome_Number 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
    System.out.print("Input a number: ");
    int number = s.nextInt();
    int sum = 0, remainder;
	 int temp = number;    
    while(number>0)
	   {    
       remainder = number % 10;   
       sum = (sum*10)+remainder;    
       number = number/10;    
      }    
     if(temp==sum)    
       System.out.println("It is a Palindrome number.");    
     else    
       System.out.println("Not a palindrome");    
    }  
}
