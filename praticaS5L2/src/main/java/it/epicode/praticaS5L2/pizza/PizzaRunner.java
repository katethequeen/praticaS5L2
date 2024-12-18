package it.epicode.praticaS5L2.pizza;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PizzaRunner implements ApplicationRunner {
    private final Pizza margherita;
    private final Pizza hammushi;
    private final Pizza hawaiian;
    private final PizzaRepo pizzaRepo;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("----------- Save Pizzas -----------");
        pizzaRepo.save(margherita);
        pizzaRepo.save(hawaiian);
        pizzaRepo.save(hammushi);
    }
}
