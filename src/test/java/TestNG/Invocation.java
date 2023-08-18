package TestNG;

import org.testng.annotations.Test;

public class Invocation {

	@Test
	public void demo1() {
		System.out.println("hai java");
	}
	
	
	@Test(priority=-1)
	public void demo2() {
		
		System.out.println("hai selenium");
	
	}
	
	
	

}

