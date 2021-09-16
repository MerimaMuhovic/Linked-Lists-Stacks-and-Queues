package homework1Task2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStackArray {

	private StackArray<Integer> num;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		num= new StackArray<Integer>();
	}

	@AfterEach
	void tearDown() throws Exception {
		num=null;
	}

	@Test
	void testEmpty() {
		
		assertTrue(num.isEmpty());
	}
	@Test
	void testPush() {
		num.push(1);
		num.push(2);
		num.push(3);

		assertEquals(3, num.size());
	}
	@Test
	void testPop() {
		num.push(10);
		num.push(9);
		
	//	assertEquals(9, num.pop());
		
	}
	

}
