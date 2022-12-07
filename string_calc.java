package task3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class string_calc {
	
	@Test
	public void test1(){
		Calc c = new Calc();
		int r = 6;
		assertEquals(r,c.getResult("1,2,3"));

	}

	@Test
	public void test2(){
		Calc c = new Calc();
		int r = 8;
		assertEquals(r,c.getResult("1\n2,5"));

	}
	
	

}
