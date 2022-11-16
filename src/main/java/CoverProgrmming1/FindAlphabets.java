package CoverProgrmming1;

public class FindAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strAlpha="Vijaykumar123189*&";
		
		char[] cv=strAlpha.toCharArray();
		
	
		
		for(int i=0;i<=cv.length;i++)
		{
			if(cv[i]>='a'&&cv[i]<='z')
			{
			System.out.println(cv[i]);
				
			}
			else if  (cv[i]>='A'&&cv[i]<='Z')
			{
				System.out.println(cv[i]);
			}
		}

	}

}
