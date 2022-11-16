package CoverProgrmming1;

import java.io.CharConversionException;
import java.util.HashMap;

public class FindRepetativeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Character, Integer> mc=new HashMap<Character, Integer>();
		
		String strValue="Vijay kumar Vijay";
	String[] strArray=strValue.toLowerCase().split(" ");
	for(int i=0;i<strArray.length;i++)
	{int count=0;
		for(int j=i+1;j<strArray.length;j++)
		{
			if(strArray[i].equals(strArray[j]))
			{
				strArray[j]="0";
				count++;
			}
		}
	

	if(count>0&&strArray[i]!="0")
	{
		System.out.println(strArray[i]);
		
		
		
		/*
		 * String stval=strArray[i]; System.out.println(stval.length());
		 */
	}
	}
	}

}
