package CoverProgramming;

import org.testng.annotations.Test;

public class FindNumberofOccurance {

	
	@Test
	public static void CharOccurance() {
		
		String str1="Vijaykumara";
		char[] vij=str1.toCharArray();
		//int count=0;
		for(int i=0;i<vij.length;i++)
		{
			for(int j=i+1;j<vij.length;j++)
			{
				if(vij[i]==vij[j])
				{
					System.out.println(vij[i]);
				
				}
			}
			
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch='y';
		int count=0;
		String str="Vijaykumar";
		/*
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}*/
		
		System.out.println(ch+""+count+""+str);
		
		
		//CharOccurance();
	}

}
