package Grouping.Testng2;

import org.testng.annotations.Test;

public class Group3 {
	@Test
	public void fin5() 
	{
		System.out.println("Hello!Welcome to Class-5");
	}
	@Test(groups="Group1")
	public void fin6() 
	{
		System.out.println("Hello!Welcome to Class-6");
	}

}
