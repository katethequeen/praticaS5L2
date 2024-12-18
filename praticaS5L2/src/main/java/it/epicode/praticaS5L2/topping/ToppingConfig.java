package it.epicode.praticaS5L2.topping;

import org.springframework.context.annotation.Bean;

public class ToppingConfig {

    @Bean(name = "tomato")
    public Topping tomato() {
        Topping tomato = new Topping();
        tomato.setName("Tomato");
        tomato.setCalories(10);
        tomato.setPrice(2.10);
        return tomato;
    }

    @Bean(name = "cheese")
    public Topping cheese() {
        Topping cheese = new Topping();
        cheese.setName("Cheese");
        cheese.setCalories(10);
        cheese.setPrice(2.10);
        return cheese;
    }

    @Bean(name = "ananas")
    public Topping ananas() {
        Topping ananas = new Topping();
        ananas.setName("Ananas");
        ananas.setCalories(10);
        ananas.setPrice(2.10);
        return ananas;
    }

    @Bean(name = "ham")
    public Topping ham() {
        Topping ham = new Topping();
        ham.setName("Ham");
        ham.setCalories(10);
        ham.setPrice(2.10);
        return ham;
    }

    @Bean(name = "mushrooms")
    public Topping mushrooms() {
        Topping mushrooms = new Topping();
        mushrooms.setName("Mushrooms");
        mushrooms.setCalories(10);
        mushrooms.setPrice(2.10);
        return mushrooms;
    }
}
