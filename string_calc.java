package task3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class string_calc {
	
	@Test
	public void test1(){
		Calc c = new Calc();
		int r = 0;
		assertEquals(r,c.getResult(""));
	}
	
	

}
