package CoverProgrmming1;

import java.util.HashMap;
import java.util.Map.Entry;

import io.cucumber.java.sl.In;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		HashMap<String , Integer> mymap=new HashMap<String, Integer>();
		mymap.put("vijay", 1);
		mymap.put("kumar", 2);
		
		for(Object myobj:mymap.entrySet())
		{
			System.out.println(myobj);
			
			//System.out.println(mymap.get(myobj));
			
			System.out.println();
		}
		
	}

	

	/*
	 * private static Object Entryset() { // TODO Auto-generated method stub return
	 * null; }
}	 */

}
