package Grouping.Testng2;

import org.testng.annotations.Test;

public class Group2 {
		@Test
	public void fin3() 
	{
		System.out.println("Hello!Welcome to Class-3");
	}

		@Test(groups="Group1")
	public void fin4() 
	{
		System.out.println("Hello!Welcome to Class-4");
	}
}

