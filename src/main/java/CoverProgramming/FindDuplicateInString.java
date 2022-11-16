 package CoverProgramming;

import org.testng.annotations.Test;

public class FindDuplicateInString {
	
	@Test
	public static void Find_Duplicate() {
		
		String str="Vijay kumar Vijay kumar hjgjgh";
		
		String[] strSp=str.toLowerCase().split(" ");
		
		for(int i=0;i<strSp.length;i++)
		{
			int count=0;
			
			for(int j=i+1;j<strSp.length;j++)
			{
				if(strSp[i].equals(strSp[j]))
				{
					strSp[j]="0";
					count++;
				}
			}
			
			
			if(count>0&&strSp[i]!="0")
			{
				System.out.println(strSp[i]);
			}
		}
		
	}

}
