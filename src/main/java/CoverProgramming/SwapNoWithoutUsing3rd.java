package CoverProgramming;

import org.testng.annotations.Test;

public class SwapNoWithoutUsing3rd {
	
	@Test
public static void Dv() {
	

	int a=45,b=50;
	
	a=a+b;
	b=a-b;
	System.out.println("This is b"+b);
	System.out.println(a);
	a=a-b;
	System.out.println("This is a "+a);
	
}
}
