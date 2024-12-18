package it.epicode.praticaS5L2.drink;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DrinkRunner implements ApplicationRunner {
    private final Drink cocaCola;
    private final Drink water;
    private final Drink soda;
    private final DrinkRepo drinkRepo;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("---------- Save Drinks -----------");
        drinkRepo.save(cocaCola);
        drinkRepo.save(water);
        drinkRepo.save(soda);
    }
}
