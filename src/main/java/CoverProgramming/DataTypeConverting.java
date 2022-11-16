package CoverProgramming;

import org.testng.annotations.Test;

public class DataTypeConverting {
	
	@Test
	public void name() {
		/*
		 * double d=12.5;
		 * 
		 * int i=(int)d; System.out.println(i);
		 * 
		 * 
		 * double b=1231231231.6;
		 * 
		 * float f=123.45f;
		 * 
		 * System.out.println(f);
		 */
		int i_value=200;
		
		String str=String.valueOf(i_value);
		
		System.out.println(str);
		
		double d=20.0;
		String str1=String.valueOf(d);
		
		//System.out.println(str1);
		
		String str2= str1.replace(".","");
		
		System.out.println(str2);
		
		
		
		if(str.equals(str2))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("Not equal");
		}
		
		
		
		double gj=8222;
		
		
		String strChange=String.valueOf(gj);
		
		String strval=strChange.replaceAll("2", "");
		
		
		System.out.println(strval.replace(".", "").replace("0",""));
		
		
		
		
		
		
	}
	{
	
	}

}
