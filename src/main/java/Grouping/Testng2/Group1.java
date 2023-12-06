package Grouping.Testng2;

import org.testng.annotations.Test;

public class Group1 {
	
	@Test(groups="Group1")
	
public void fin() 
{
	System.out.println("Hello!Welcome to Class-1");
}
	
	
		@Test
	public void fin2() 
	{
		System.out.println("Hello!Welcome to Class-2");
	}
		@Test
		public void fin22() 
		{
			System.out.println("Hello!Welcome to Class-22");
		}
		@Test(groups="Group1")
		public void fin23() 
		{
			System.out.println("Hello!Welcome to Class-23");
		}
}
	
