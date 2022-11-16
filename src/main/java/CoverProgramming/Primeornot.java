package CoverProgramming;

import org.testng.annotations.Test;

public class Primeornot {
	
	@Test
	public static void PorNot() {
		
		
		int p=14;
		
		int b=0;
		if(p>0)
		{
			for(int i=2;i<p;i++)
			{
				
				if(p/i==0)
				{
					b=1;
					break;
				}
				
				
			}
			if(b==0)
			{
				System.out.println("this is prime number");
			}
			
			
		}
	}

}
