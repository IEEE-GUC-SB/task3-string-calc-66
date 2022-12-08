package task3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class string_calc {
	
	
	@Test
	public void test1() throws Exception{
		Calc c = new Calc();
		int r = 6;
		assertEquals(r,c.getResult("1,2,3"));

	}

	@Test
	public void test2() throws Exception{
		Calc c = new Calc();
		int r = 8;
		assertEquals(r,c.getResult("1\n2,5"));
		
	}
	@Test
	public void test3() throws Exception{
		Calc c = new Calc();
		int r = 0;
		
		assertEquals(r,c.getResult("1,\n"));
		
	}

	@Test
	public void test4() {
		Calc c = new Calc();
	    Exception exception = assertThrows(Exception.class, () -> {
	        c.getResult("-1,2,3");
	    });

	    String expectedMessage = "negatives not allowed";
	    
	    String actualMessage = exception.getMessage();
	    //System.out.println(actualMessage);
	    assertTrue(actualMessage.contains(expectedMessage));
	}
	
	

}
