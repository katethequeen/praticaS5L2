package it.epicode.praticaS5L2.menu;

import it.epicode.praticaS5L2.drink.Drink;
import it.epicode.praticaS5L2.pizza.Pizza;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String description;

    @OneToMany
    private List<Pizza> pizzas;

    @OneToMany
    private List<Drink> drinks;

    public void printMenu() {
        System.out.println("Menu: " + this.name);
        System.out.println("Pizze: ");
        for(Pizza pizza : pizzas) {
            System.out.println(pizza.descrizione() + " - " + pizza.calorie() + " - " + pizza.prezzo());
        }

        System.out.println("Drinks: ");
        for(Drink drink : drinks) {
            System.out.println(drink.descrizione() + " - " + drink.calorie() + " - " + drink.prezzo());

        }
    }
}
