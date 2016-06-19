package finallabpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class Addclasstest {

	@Test
	public void test() {
		Add ad=new Add();
		int result1=ad.add(5);
		assertEquals(10,result1);
		
	}

}
