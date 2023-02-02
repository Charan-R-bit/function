package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class combineArray {

	public static void main(String[] args) 
	{
		combineArray ca = new combineArray();
		ca.array();
		ca.array1();
		ca.merge(ca.array(),ca.array1());
	
	}

	public   ArrayList<String> array()
	{
		ArrayList<String> s = new ArrayList<>();
		s.add("hello");
		return s;
	}
	public static ArrayList<String> array1()
	{
		ArrayList<String> s1 = new ArrayList<>();
		s1.add("Charu");
		return s1;
	}
	public static void merge(ArrayList<String> s,ArrayList<String> s1)
	{
	s.addAll(s1);
	System.out.println(s);
	}
}
