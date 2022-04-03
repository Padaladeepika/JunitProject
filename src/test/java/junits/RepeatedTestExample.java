package junits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestExample {
	
	@RepeatedTest(3)// used to repeat
	public void addTest1() {
		
		assertEquals(9,Calculator.add(4,5));
		
	}
	@Disabled// used to disable the test	
	@Test
		public void subTest1() {
			
			assertEquals(9,Calculator.add(4,5));
			
		
	}

}
