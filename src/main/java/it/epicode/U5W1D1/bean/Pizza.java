package it.epicode.U5W1D1.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Pizza extends Prodotto{
    private List<Topping> toppings;
    public Pizza(List<Topping> toppings) {
        this.toppings = toppings;
    }
    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }
}
