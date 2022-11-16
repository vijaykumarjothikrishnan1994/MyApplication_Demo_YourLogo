package CoverProgrmming1;

import java.util.HashMap;

public class CountOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Vijaykumar";
		
		HashMap< Character, Integer> mc=new HashMap<>();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			if(mc.containsKey(str.charAt(i)))
			{
				int count=mc.get(str.charAt(i));
				
				mc.put(str.charAt(i), ++count);
			}
			else
			{
				mc.put(str.charAt(i), 1);
			}
		}
		
		System.out.println(mc);

	}

}
