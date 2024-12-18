package it.epicode.praticaS5L2.pizza;

import it.epicode.praticaS5L2.topping.Topping;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class PizzaConfig {
    private final Topping tomato;
    private final Topping cheese;
    private final Topping ananas;
    private final Topping ham;
    private final Topping mushrooms;

    @Bean(name = "margherita")
    public Pizza margherita() {Pizza margherita = new Pizza();
    margherita.setName("Margerita");
    margherita.setCalories(100);
    margherita.setPrice(4.99);
    margherita.getIngredients().add(tomato);
    margherita.getIngredients().add(cheese);
        return margherita;
    }

    @Bean(name = "hawaiian")
    public Pizza hawaiian() {
        Pizza hawaiian = new Pizza();
        hawaiian.setName("Hawaiian");
        hawaiian.setCalories(900);
        hawaiian.setPrice(49.99);
        hawaiian.getIngredients().add(tomato);
        hawaiian.getIngredients().add(cheese);
        hawaiian.getIngredients().add(ananas);
        hawaiian.getIngredients().add(ham);
        return hawaiian;
    }

    @Bean(name = "Hammushi")
    public Pizza Hammushi() {
        Pizza Hammushi = new Pizza();
        Hammushi.setName("Hammushi");
        Hammushi.setCalories(80);
        Hammushi.setPrice(7.99);
        Hammushi.getIngredients().add(tomato);
        Hammushi.getIngredients().add(cheese);
        Hammushi.getIngredients().add(ham);
        Hammushi.getIngredients().add(mushrooms);
        return Hammushi;
    }
}
