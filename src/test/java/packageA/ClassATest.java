package packageA;

import org.junit.Test;
import org.junit.jupiter.api.Tag;

public class ClassATest {
	
	@Tag("Sanity")
	@Test
	public void Test1() {
		
		System.out.println("Inside Test1");
	}

}
