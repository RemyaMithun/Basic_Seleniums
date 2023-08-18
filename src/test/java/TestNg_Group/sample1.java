package TestNg_Group;

import org.testng.annotations.Test;

public class sample1 {

	@Test(groups = "smoke")
	public void demo1(){
		System.out.println("hai demo1");
	}
	@Test
	 public void demo2() {
		System.out.println("hello demo2");
		
	}
	
}

