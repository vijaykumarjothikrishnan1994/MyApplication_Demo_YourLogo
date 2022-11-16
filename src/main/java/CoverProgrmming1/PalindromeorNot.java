package CoverProgrmming1;

public class PalindromeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121,sum=0;
		int temp=num;
		while(num>0)
		{
			int rev=num%10;
			
			sum=(sum*10)+rev;
			num=num/10;
			
		}
		if(temp==sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindorme");
		}

	}

}
