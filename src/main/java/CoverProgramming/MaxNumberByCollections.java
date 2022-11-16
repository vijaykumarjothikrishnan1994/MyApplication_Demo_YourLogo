package CoverProgramming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class MaxNumberByCollections {
	
	@Test
	public static void Collections_Max() {
		
		List<Integer> totalVal=new ArrayList<Integer>();
		
		totalVal.add(24);
		totalVal.add(241);
		totalVal.add(324);
		
		System.out.println(Collections.max(totalVal));
		System.out.println(Collections.min(totalVal));
	}

}
