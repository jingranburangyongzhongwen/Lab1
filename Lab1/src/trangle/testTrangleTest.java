package trangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class testTrangleTest {

	@Test
	public void test() {
		testTrangle t = new testTrangle();
		assertEquals("not a trangle",t.trangle(0, 1, -1));
		assertEquals("not a trangle",t.trangle(1, 2, 3));
		assertEquals("not a trangle",t.trangle(1, 2, 3));
		assertEquals("equilateral",t.trangle(3, 3, 3));
		assertEquals("isosceles",t.trangle(2, 2, 3));
		assertEquals("scalene",t.trangle(4, 2, 3));
	}

}
