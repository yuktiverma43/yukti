package project1;

public class FibonacciSeries 
{


public void createFaboniaSeies() {
	int a = 0 , b=1 ,c , count =10;
	
	System.out.print(a + " ");
	System.out.print(b + " ");
	
	
	
	for(int i = 2 ; i <= count ; i ++) {
		c = a + b ;
		System.out.print(c + " ");
		
		a=b;
		b=c;
		
	}
	
}


public static void main(String[] args)
{
	FibonacciSeries FB = new FibonacciSeries();
	FB.createFaboniaSeies();
}



}

