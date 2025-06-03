package it.epicode.U5W1D1.configuration;

import it.epicode.U5W1D1.bean.Drink;
import it.epicode.U5W1D1.bean.Menu;
import it.epicode.U5W1D1.bean.Pizza;
import it.epicode.U5W1D1.bean.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean(name = "toppings_tomato")
    public Topping toppingTomatoBean() {
        return new Topping("Tomato", 0, 0);
    }

    @Bean(name = "toppings_mozzarella")
    public Topping toppingMozzarellaBean() {
        return new Topping("Mozzarella", 92, 0.69);
    }

    @Bean(name = "toppings_mushrooms")
    public Topping toppingMushroomsBean() {
        return new Topping("Mushrooms", 20, 0.99);
    }

    @Bean(name = "toppings_basil")
    public Topping toppingBasilBean() {
        return new Topping("Basil", 0, 0.10);
    }

    @Bean(name = "toppings_anchovies")
    public Topping toppingAnchoviesBean() {
        return new Topping("Anchovies", 86, 1.50);
    }


    @Bean(name = "pizza_margherita")
    public Pizza pizzaMargheritaBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingMozzarellaBean());
        tList.add(toppingBasilBean());
        return new Pizza("Pizza Margherita", tList, false);
    }

    @Bean(name = "forest_pizza")
    public Pizza pizzaSuperMarioBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingMozzarellaBean());
        tList.add(toppingMushroomsBean());
        return new Pizza("Super Mario Pizza", tList, false);
    }

    @Bean(name = "marinara_pizza")
    public Pizza pizzaMarinaraBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingAnchoviesBean());
        return new Pizza("Marinara Pizza", tList, false);
    }

    @Bean(name = "super_mario_pizza_xl")
    public Pizza pizzaSuperMarioXlBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingMozzarellaBean());
        tList.add(toppingMushroomsBean());
        return new Pizza("Super Mario Pizza XL", tList, true);
    }

    @Bean(name = "lemonade")
    public Drink lemonadeBean() {
        return new Drink("Lemonade", 128, 1.29);
    }

    @Bean(name = "water")
    public Drink waterBean() {
        return new Drink("Water", 0, 1.29);
    }

    @Bean(name = "beer")
    public Drink beerBean() {
        return new Drink("beer", 200, 7.49);
    }

    @Bean(name = "menu")
    public Menu menuBean() {
        List<Pizza> pizzaList = new ArrayList<>();
        List<Drink> drinkList = new ArrayList<>();
        List<Topping> toppingsList = new ArrayList<>();

        pizzaList.add(pizzaMargheritaBean());
        pizzaList.add(pizzaSuperMarioBean());
        pizzaList.add(pizzaMarinaraBean());
        pizzaList.add(pizzaSuperMarioXlBean());

        drinkList.add(lemonadeBean());
        drinkList.add(waterBean());
        drinkList.add(beerBean());

        toppingsList.add(toppingTomatoBean());
        toppingsList.add(toppingMozzarellaBean());
        toppingsList.add(toppingMushroomsBean());
        toppingsList.add(toppingBasilBean());
        toppingsList.add(toppingAnchoviesBean());

        return new Menu(pizzaList, drinkList, toppingsList);
    }
}
