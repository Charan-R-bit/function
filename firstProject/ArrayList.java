package firstProject;

import java.util.HashMap;
import java.util.List;

public class ArrayList 
{
	public static void main (String[] Args)
	{
		ArrayList.Create();
	}

public static void Create() 
{
		HashMap<Integer,String> h = new HashMap<Integer,String>();
		h.put(1, "Hello");
		h.remove(1);
		System.out.println(h.get(1));
}
}
