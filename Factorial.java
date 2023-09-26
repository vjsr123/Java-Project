
public class Factorial {
	public void factorialn(int x)
	{
		if(x>0)
		{
			int fact =1;
			for (int i=x;i>0;i--)
			{
				fact= fact*i;
			}
			System.out.println("The factorial of "+x +"is : "+ fact);
		}
		
	}

}
