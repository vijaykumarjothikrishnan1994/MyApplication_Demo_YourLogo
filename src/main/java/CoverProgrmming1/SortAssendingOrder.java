package CoverProgrmming1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE;

public class SortAssendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {13,21,131,4,50};
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(a[0]);
		list.add(a[1]);
		list.add(a[2]);
		list.add(a[3]);
		list.add(a[4]);
		
		//Collections.sort(list);
		//System.out.print(Collections.sort(list));
		
		Collections.sort(list,Collections.reverseOrder());
		
		System.out.println(Collections.max(list));
		
		for (Integer integer : list) {
			
			System.out.println(integer);
			
		}
		
		
		
		

	}

}
