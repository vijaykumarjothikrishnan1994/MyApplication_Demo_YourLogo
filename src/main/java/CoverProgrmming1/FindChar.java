package CoverProgrmming1;

import java.util.Collections;
import java.util.HashMap;

public class FindChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap< Character, Integer> mc=new HashMap<>();
		
		String str="VijaykumarVV";
		
		
		char[] cv=str.toCharArray();
		
		for(int i=0;i<cv.length;i++)
		{
			for(int j=i+1;j<cv.length;j++)
			{
				if(cv[i]==cv[j])
				{
					System.out.println(cv[i]);
					
					/*
					 * char str1=cv[i]; String strcount=String.valueOf(str1);
					 * System.out.println(strcount.length());
					 */
					
					if(mc.containsKey(cv[i]))
					{
					int countv=	mc.get(cv[i]);
					
					
					
					//mc.put(, null)
					
					
					
					}
					
					
				}
			}
		}
	}

}
