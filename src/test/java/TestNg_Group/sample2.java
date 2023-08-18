package TestNg_Group;

import org.testng.annotations.Test;

public class sample2 {

	@Test
	public void demo3() {
		System.out.println("hai demo3");
	}
	
	@Test(groups = "smoke")
	public void demo4() {
		System.out.println("hai demo4");
	}
}
