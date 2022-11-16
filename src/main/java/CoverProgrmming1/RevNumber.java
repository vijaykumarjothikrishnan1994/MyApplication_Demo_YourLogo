package CoverProgrmming1;

public class RevNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1212;
		int sum=0;
		int temp=num;
		while(num>0)
		{
			int rev= num%10;
			
			 sum=(sum*10)+rev;
			
			num=num/10;
			
		}
		
		if(temp==sum) {
		System.out.println("This is palindorme");
		System.out.println(temp);
		}
		else
		{
			System.out.println("Not");
			System.out.println(sum);
		}

	}

}
