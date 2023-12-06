package Grouping.Testng2;

import org.testng.annotations.Test;

public class Prioritizing {

	@Test(priority=4)
	
	public void pri1() 
	{
		System.out.println("Hello!Welcome to Prioritizing-1");
	}
		
		
			@Test(priority=2)
		public void pri2() 
		{
			System.out.println("Hello!Welcome to Prioritizing-2");
		}
			@Test(priority=3)
			public void pri3() 
			{
				System.out.println("Hello!Welcome to Prioritizing-3");
			}
			@Test(priority=1)
			public void pri4() 
			{
				System.out.println("Hello!Welcome to Prioritizing-4");
			}
}
