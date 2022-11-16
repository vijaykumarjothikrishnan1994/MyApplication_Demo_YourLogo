package CoverProgrmming1;

public class FibnossiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n1=3,n2=5;
		
		for(int i=0;i<5;i++)
		{
		int n3=n1+n2;
		
		n1=n2;
		n2=n3;
		System.out.println(n3);
		}
			

	}

}
