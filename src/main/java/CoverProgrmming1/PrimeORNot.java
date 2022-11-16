package CoverProgrmming1;

public class PrimeORNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int prn=39 ;
		int findPrime=0;
		for(int i=2;i<=prn;i++)
		{
			if(prn%i==0)
			{
				System.out.println("Not a prime");
				findPrime=1;
				
			break;	
			}
			
		}
		if(findPrime==0)
		{
			System.out.println("Prime");
		}

	}

}
