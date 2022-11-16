package CoverProgramming;

import org.testng.annotations.Test;

public class FIndDuplicate_in_Character {
	@Test
	public static void Find_the_duplicate() {
		
		
		String str="Vijaykumarij";
		
		char[] value=str.toCharArray();
		
		for(int i=0;i<value.length;i++)
		{
			for(int j=i+1;j<value.length;j++)
			{
				if(value[i]==value[j])
				{
					System.out.println(value[i]);
				}
			}
		}
		
	}

}
