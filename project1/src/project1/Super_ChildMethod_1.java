package project1;

public class Super_ChildMethod_1 extends Super_ParentMethod_1
{
	public void m6()
	 {
		 super.m3(1, 2);
		System.out.println("Child default method");
	 }
	 public void m7(int a)
	 {
		 System.out.println("Child one parameterized method");
	 }
	 public void m8(int a, int b)
	 {
		 System.out.println("Child two parameterized method");
	 }
	 public void m9(int a, int b, int c)
	 {
		 this.m6();
		 this.m8(1, 2);
		 this.m10(1, 2, 3, 4);
		 System.out.println("Child three parameterized method");
	 }
	 public void m10(int a,int b,int c, int d)
	 {
		 System.out.println("Child four parameterized method");
	 }
	 public static void main(String[] args) 
	 {
		Super_ChildMethod_1 obj = new Super_ChildMethod_1();
		obj.m9(1, 2, 3);
	}
}

