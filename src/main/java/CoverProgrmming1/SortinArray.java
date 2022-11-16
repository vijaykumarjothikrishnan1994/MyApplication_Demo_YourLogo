package CoverProgrmming1;

public class SortinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a=new int[] {1,90,78,32};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}

	}

}
