
public class digitsum {
	public void digit(int x)
	{ int sum =0;
		for(int i=1;i<=x;i++)
		{
			sum = sum + (x%10);
			x = x/10;
		}
		System.out.println(sum);
	}
}
