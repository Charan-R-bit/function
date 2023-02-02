package ArrayList;

import java.util.ArrayList;

public class ArrayLIST {
	 static ArrayList<Integer> l = new ArrayList<>();

	public static void main(String[] args) 
	{
		ArrayLIST a = new ArrayLIST();
				a.array();
		
		a.display(l);
	}
	public  void array()
	{
		l.add(0, 2);
		l.add(1, 4);
		l.add(2, 6);
		l.add(3, 8);
		l.add(4, 10);
		
		
	}
	public static void display(ArrayList<Integer> s)
	{
		System.out.println(s);
	}
	

}
