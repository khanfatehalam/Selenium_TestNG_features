package Grouping.Testng2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
@Test
@Parameters ({"url"})
	
	public void pra11(String URL) 
	{
		System.out.println("Hello!Welcome to Parameterization-11");
		System.out.println(URL);
	}
		
		
			@Test
		public void pra22() 
		{
			System.out.println("Hello!Welcome to Parameterization-22");
		}
			
			@Test
			@Parameters ({"site"})
			public void pra33( String SITE) 
			{
				System.out.println("Hello!Welcome to Parameterization-33");
				System.out.println(SITE);
				
			}
			
			
			@Test
			public void pra44() 
			{
				System.out.println("Hello!Welcome to Parameterization-44");
			}

}
