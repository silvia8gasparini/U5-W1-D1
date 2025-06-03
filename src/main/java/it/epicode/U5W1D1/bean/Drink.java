package it.epicode.U5W1D1.bean;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drink extends Item{
    private String name;

    public Drink(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                '}';
    }
}