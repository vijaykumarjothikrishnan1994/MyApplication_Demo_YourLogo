package CoverProgramming;

import java.util.ArrayList;import java.util.Collections;
import java.util.List;

public class CollectionsSort_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> litint=new ArrayList<Integer>();
		
		litint.add(123429034);
		litint.add(121);
		litint.add(2113123);
		
		//System.out.println();
		
		Collections.sort(litint,Collections.reverseOrder());
		
		for (Integer integer : litint) {
			
			System.out.println(integer);
			
		}
	}

}
