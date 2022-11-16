package CoverProgrmming1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Vijaykumar";
		
		str.replace("i", "j");
		//System.out.println(str.replace("i", "j").replace("j", ""));
		
		System.out.println(str.substring(1,2));
	String strss=	str.substring(1,2);
		
		//System.out.println(strss.replace(0, 0));
	
	System.out.println(Math.max(12, 20));
	
	System.out.println(str.charAt(3));
	
	String mytrim="  kumar   ";
	
	System.out.println(mytrim.trim().length());
	
	
	String strxpath="//input[contains(text(),'submit')]";
	
	String ValueNeedstochange="'Kumar'";
	
	String split="//input[contains(text(),"+ValueNeedstochange+")]";
	
	System.out.println(split);
		

	}

}
