package com.learning.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Demo for Spring AOP
// Aspect Oriented programming
/*you need to write diff lines of code for each method
1logger
2security
3.transaction begin
4. business logic
5.transaction end
 you will write all other info in Aspect and will have only business logic in spring framework*/


//Aspect Oriented programming
//cross cutting concerns  --> Aspect



public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student s= context.getBean(Student.class);
		s.show();           

	}

}
