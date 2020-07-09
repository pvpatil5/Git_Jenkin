package pac;

public class Sample2 {

	public static void main(String[] args) 
	{
		String s1= "Automation";
		
		char c[] = s1.toCharArray();

		for (int i = c.length-1; i >=0; i--) 
		{
			System.out.print(c[i]);
		}

	}

}
