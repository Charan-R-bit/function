package casestudy2;

import java.util.Scanner;

public class Luck 
{
	String s ;
	int j=1;
	int b=0;
	boolean flag =false;
	int temp =0;
	int temp1=0;
	public static void main (String[] args)
	{
		Luck l = new Luck();
		l.display();
		l.logic();
	}
	public void display() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string luck");
		s = sc.next();
	}
	public void logic()
	{
		
		
//		for(int a =0;a<s.length()-1;a++)
//		{
//			if(s.charAt(a)==s.charAt(b))
//			{
//				temp=a;
//				b++;
//			}
//		}
		temp=s.length()/3;
		temp1=temp;
		System.out.println(s.length());
		for(int i=0;i<s.length();i++)
		{
				if(s.charAt(j)==s.charAt(i))
				{
					flag=true;
					j=i+1;
					b=j;//i or j
					System.out.println(temp+""+b);
					System.out.println(s.charAt(j)+""+s.charAt(i));
					
				}
				else if(s.charAt(temp)==s.charAt(b))
					{
						temp=temp1*2;
						for(int k=b;k<s.length()-1;k++)
						{
							if(s.charAt(i+1)==s.charAt(j+1))
							{
								flag=true;
								j=i+1;
								b=j;	
								
							}
						}
					}
						else if(s.charAt(temp)==s.charAt(b))
							{
								temp=temp1*3;
								for(int k=b;k<s.length()-1;k++)
								{
									if(s.charAt(i+1)==s.charAt(j+1))
									{
										flag=true;
										j=i+1;
										b=j;
									}
								}
							}
							else 
							{
								flag=false;
							}
						}
					
			
		if(flag==true)
		{
			System.out.println("Yes");
		}
		if(flag==false)
		{
			System.out.println("No");
		}
	}
	
}
