package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class MathUtilsTest {	
	MathUtils math;
	
	@BeforeAll
	static void beforallClean() {
		System.out.println("before all cleaning up ... step......");
	}
	
	
	@BeforeEach
	void setUp() {
		math= new MathUtils();
		System.out.println("setup ...");
	 }
	
	@AfterEach
	 void tearDown() {
		 System.out.println(" tearDown .....\n    ");
	 }
	
	@Test
	@DisplayName("Testing add method")
	void testAdd() {
			//MathUtils math= new MathUtils();
			int expected=2;
			int actual = math.add(1, 1);
			System.out.println("test Add");
			assertEquals(expected, actual ," this is testing string to test add method");			
			
		}
	
	@Test
	void testDivide() {
			//MathUtils math= new MathUtils();						
			assertThrows(ArithmeticException.class, () -> math.divide(4, 0), " Divide by zero exception" );						
		}

	
	@Test
	void testCircleRadius() {
		//MathUtils math= new MathUtils();
		System.out.println("test circleradius");
		assertEquals(16.1415, math.circleArea(4.15),"should return right value");
		
	}
	
	@Test
	@Disabled
	@DisplayName("TDD method.. should not run")
	void testDisabled() {
			System.out.println(" testDisabled method");
			fail(" this is testDisabled method");			
			
		}
	
	@AfterAll
	void afterAll() {
		System.out.println(" after all tests this step is running....");
	}

}
