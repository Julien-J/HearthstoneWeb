package fr.jjouenne;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String args[]) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:application-context.xml" })) {
			
		}
	}

}
