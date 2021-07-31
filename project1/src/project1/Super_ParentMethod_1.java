package project1;

public class Super_ParentMethod_1 
{
 public void m1()
 {
	 System.out.println("Parent default method");
 }
 public void m2(int a)
 {
	 System.out.println("Parent one parameterized method");
 }
 public void m3(int a, int b)
 {
	 this.m4(1, 2, 3);
	 this.m1();
	 this.m2(1);
	 this.m5(1, 2, 3, 4);
	 System.out.println("Parent two parameterized method");
 }
 public void m4(int a, int b, int c)
 {
	 System.out.println("Parent three parameterized method");
 }
 public void m5(int a, int b, int c, int d)
 {
	 System.out.println("Parent four parameterized method");
 }
}
