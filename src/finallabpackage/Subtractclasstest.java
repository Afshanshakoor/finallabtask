package finallabpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class Subtractclasstest {

	@Test
	public void test() {
		Subtract sub=new Subtract();
		int result1=sub.subtract(20);
		assertEquals(15,result1);
	}

}
