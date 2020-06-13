package TestNGbasics;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	@Test(invocationTimeOut=2)
	public void infinitelooptest() {
		int i = 1;
		while(i==1) {
			System.out.println(i);
			
		}
	}

}
