package CoverProgrmming1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.testng.annotations.Test;

public class CovertDataTyps {
	
	@Test
	public static void name() {
		
		int i=78131;
		
		String str="122";
		double d=899.89;
		
		double f=9120918203.4;
		
		String str_i=String.valueOf(i);
		System.out.println(i);
		
		int idc=Integer.parseInt(str);
		System.out.println(idc+2);
		
		double dv=Double.parseDouble(str_i);
		
		System.out.println(dv);
		
		float fv=Float.parseFloat(str_i);
		
		System.out.println(fv);
		
		
		
		
	}

}
