package Constructors;


public class Constructor1 extends Constructor2
{
	int a=10;
	double b=20.00;
	float c=20.21f;
	
	public static void main(String args[])  
	{
		Constructor1 con = new Constructor1(10,10.00f);
	}
	public Constructor1(int a) 
	{
		this(20,20.00);
		System.out.println("i am in constructor int");
	}
		public Constructor1(int a, double b) 
		{
			super("Super class");
			System.out.println("i am in constructor int, double");
		}
		public Constructor1(int a, float c) 
		{
			this(10);
			 System.out.println("i am in constructor int,  float");
			 System.out.print(a+" "+c);
		}
	}
