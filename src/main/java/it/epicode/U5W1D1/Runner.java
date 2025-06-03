package it.epicode.U5W1D1;

import it.epicode.U5W1D1.bean.Drink;
import it.epicode.U5W1D1.bean.Pizza;
import it.epicode.U5W1D1.bean.Topping;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Runner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(U5w1d1teoriaApplication.class);
        Drink water = ctx.getBean(Drink.class);

        System.out.println(water);

        Topping t1 = ctx.getBean("mozzarella",Topping.class);

        System.out.println(t1);

        Topping t2 = ctx.getBean("tomato",Topping.class);

        System.out.println(t2);

        Pizza p = ctx.getBean(Pizza.class);

        System.out.println(p);
    }
}
