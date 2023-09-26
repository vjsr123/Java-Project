
public class charcase {
	public void method(char c)
	{
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println("Lowercase vowel letter");
		}
		else if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			System.out.println("Uppercase vowel letter");
		}
		else if(c>=65 && c<=90)
		{
			System.out.println("Uppercase Consonant letter");
		}
		else if(c>=97 && c<=122)
		{
			System.out.println("Lowercase Consonant letter");
		}
		else if(c>=0 && c<=9)
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Character");
		}
		
	}

}
