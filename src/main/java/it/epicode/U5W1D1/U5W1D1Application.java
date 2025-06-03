package it.epicode.U5W1D1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.*;

@SpringBootApplication
@Slf4j
public class U5W1D1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5W1D1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D1Application.class);

		it.epicode.U5W1D1.bean.Menu m = (it.epicode.U5W1D1.bean.Menu) ctx.getBean("menu");

		m.printMenu();
		ctx.close();
	}

}
