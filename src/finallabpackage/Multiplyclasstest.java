package finallabpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class Multiplyclasstest {

	@Test
	public void test() {
		Multiply mul=new Multiply();
		int result=mul.multiply(20);
		assertEquals(result,400);
		
	}

}
