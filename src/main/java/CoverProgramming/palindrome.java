package CoverProgramming;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=345,sum=0,r=0;
		
		int temp=n;
		
		;//palindrome
		
		while(n>0)
		{ r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		System.out.println(sum);
		if(temp==sum)
		{
			System.out.println("palin");
		}
		else
		{System.out.println("Not palin");
			
		}

	}

}
