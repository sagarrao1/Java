package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@TestInstance(Lifecycle.PER_CLASS)
class MathUtilsTest {	
	MathUtils math;
	
	@BeforeAll
	static void beforallClean() {
		System.out.println("before all cleaning up ... step....@BeforeAll..");
	}
	
	
	@BeforeEach
	void setUp() {
		math= new MathUtils();
		System.out.println("setup ...@BeforeEach");
	 }
	
	@AfterEach
	 void tearDown() {
		 System.out.println(" tearDown .....@AfterEach\n    ");
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
//	@EnabledOnOs(OS.LINUX)
	void testDivide() {
			//MathUtils math= new MathUtils();
			boolean isServerUp = true;
			assumeTrue(isServerUp);
			//assuming like value is if my server is up only run this, otherwise skip this test case.
			// it is different from assertion, only run it if up
			assertThrows(ArithmeticException.class, () -> math.divide(4, 0), " Divide by zero exception" );						
		}

	
	@Test
	void testCircleRadius() {
		//MathUtils math= new MathUtils();
		System.out.println("test circleradius");
		assertEquals(54.07865000000002, math.circleArea(4.15),"should return right value");
		
	}
	
	@Test
	@Disabled
	@DisplayName("TDD method.. should not run")
	void testDisabled() {
			System.out.println(" testDisabled method");
			fail(" this is testDisabled method");			
			
		}
	
	@Nested
	@DisplayName("Testing add method with nested test cases")
	class addTest {
		
			@Test
			@DisplayName("Testing postive")
			void testPositive() {
				assertEquals(2, math.add(1, 1) ," should return right sum");			
			}
			
			@Test
			@DisplayName("Testing Negative")
			void testNegative() {
				assertEquals(-2, math.add(-1, -1));
			}
	
	}
	
	
//	AssertAll example
	@Test
	void testMultilpy() {
//		assertEquals(4, math.multiply(1, 1), "should return ritgh product");
//		asserAll uses Lambdas
		assertAll(
				() -> assertEquals(1, math.multiply(1, 1)),
				() -> assertEquals(4, math.multiply(2, 2)),
				() -> assertEquals(-2, math.multiply(1, -2))				
				);
	}

	
	//Lazy loading example for performance improvement
//	it will calculated string only when test fails when we use lambda other wise
//	 it will calculated everytime test executes but only displays when it fails
	@Test
	@DisplayName("Testing Lazy loading ")
	void testNeg() {		
		int expteced = -6;
		int actual = math.multiply(-3, 2);
//		assertEquals(expteced, actual , "expected is this : "+expteced + " but actual is: "+ actual );
		assertEquals(expteced, actual , () -> "expected is this : "+expteced + " but actual is: "+ actual );
	}


	
//	RepeatedTest example
	@RepeatedTest(3)
	void testRepeat(RepetitionInfo repetitionInfo) {
//		System.out.println(repetitionInfo.getCurrentRepetition());
//		if (repetitionInfo.getCurrentRepetition() == 2) {
//			System.out.println("do somthing is repition == 2");
//		}
		assertEquals(4, math.add(2, 2));
	}
	
	
	
//	Tagging test case example
	@Test
	@Tag("Circle")
	void testCircleRadiusTag() {
		//MathUtils math= new MathUtils();
		System.out.println("test circleradius");
		assertEquals(54.07865000000002, math.circleArea(4.15),"should return right value");
		
	}
	
	@AfterAll
	void afterAll() {
		System.out.println(" after all tests this step is running....@AfterAll");
	}

}
