package junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnnotationExample {
	
	
	@BeforeAll
	public static void method3() {	
		System.out.println("Inside Before All");
	}
	
	@BeforeEach
	public void method1() {	
		System.out.println("Inside Before Each");
	}
	
	@Test
	public void addTest1() {
		assertEquals(9,Calculator.add(4, 5));
		assertTrue(true);
	
		
		String[] arrayy1 = {"one","two"};
		
		String[] arrayy2 = {"one","two"};
		
		System.out.println("Inside Test1");
		
		
	}
	@Test
	public void addTest2() {
		assertEquals(9,Calculator.add(5, 4));
		System.out.println("Inside Test2");
	}
	
	@AfterEach
	public void method2() {
		System.out.println("Inside After Each");
	}
	
	
	@AfterAll
	public static void method4() {
		System.out.println("Inside After All");		
	}
	
	
}
