package TestNG;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority=-3,invocationCount=2)
	public void demo1() {
		
	System.out.println("hai demo1");
	
}
	
	@Test (priority=-5)
	public void demo2() {
		
	System.out.println("hai demo2");
	
	
}
	@Test (priority=1,invocationCount = 3)
	public void demo3() {
		
	System.out.println("hai demo3");
	
}
	
}