package firstProject;


import java.util.List;

public class array 
{
	
	String name;
	int id;
	int marks;	
	void hello()
{
		name="Charan";
		id=10;
		marks = 99;
		
}
	void print()
	{
		System.out.println("name :"+name);
		System.out.println("id :"+id);
		System.out.println("marks :"+marks);
	}
	public static void main(String[] args)
	{
		array a = new array();
		a.hello();
		a.print();
	}
}
	

