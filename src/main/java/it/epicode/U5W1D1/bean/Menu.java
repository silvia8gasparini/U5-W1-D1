package it.epicode.U5W1D1.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Menu {
    @Autowired
    private List<Prodotto> prodotti;

}
