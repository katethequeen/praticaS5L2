package it.epicode.praticaS5L2.drink;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DrinkConfig {

    @Bean(name = "cocaCola")
    public Drink cocaCola() {
        Drink cocaCola = new Drink();
        cocaCola.setName("CocaCola");
        cocaCola.setCalories(33);
        cocaCola.setPrice(2.99);
        return cocaCola;
    }

    @Bean(name = "water")
    public Drink water() {
        Drink water = new Drink();
        water.setName("Water");
        water.setCalories(10);
        water.setPrice(0.99);
        return water;
    }

    @Bean(name = "soda")
    public Drink soda() {
        Drink soda = new Drink();
        soda.setName("Soda");
        soda.setCalories(43);
        soda.setPrice(2.10);
        return soda;
    }
}
