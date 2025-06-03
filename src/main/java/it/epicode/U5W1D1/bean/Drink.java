package it.epicode.U5W1D1.bean;

import it.epicode.U5W1D1.enumeration.TipoDrink;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Drink extends Prodotto{
    private TipoDrink tipoDrink;
}
