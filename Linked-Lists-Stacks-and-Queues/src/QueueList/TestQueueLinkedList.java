package homework1Task3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import homework1Task2.StackArray;

class TestQueueLinkedList {

	private QueueList<Integer> num;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		num= new QueueList<Integer>();
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
	void testEn() {
		num.enqueue(1);
		num.enqueue(2);
		num.enqueue(3);
		
		assertEquals(3, num.size());
	}
	
	@Test
	void testEmptyDe() {
		num.enqueue(1);
		num.enqueue(2);
		num.enqueue(3);
		
	//	assertEquals(1, num.dequeue());
	}

}
