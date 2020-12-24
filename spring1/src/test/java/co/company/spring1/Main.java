package co.company.spring1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import co.company.spring1.config.MvcConfiguration;
import co.company.spring1.controller.Greeter;

public class Main {
	public static void main(String[] args) {
//		Greeter g = new Greeter();
//		g.setformat("%s,안녕하세요");
		AnnotationConfigApplicationContext ctx = 
		new AnnotationConfigApplicationContext(MvcConfiguration.class);
	
		Greeter g = ctx.getBean(Greeter.class);
		String msg = g.greet("스프링");
		System.out.print(msg);

	}
}
