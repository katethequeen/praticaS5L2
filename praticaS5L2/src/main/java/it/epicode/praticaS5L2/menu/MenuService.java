package it.epicode.praticaS5L2.menu;

import it.epicode.praticaS5L2.drink.Drink;
import it.epicode.praticaS5L2.drink.DrinkRepo;
import it.epicode.praticaS5L2.pizza.Pizza;
import it.epicode.praticaS5L2.pizza.PizzaRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuService {
    private final PizzaRepo pizzaRepo;
    private final DrinkRepo drinkRepo;
    private final MenuRepo menuRepo;
    private final Menu firstMenu;

    @Transactional
    public Menu createAndSave() {
        List<Pizza> pizzas = pizzaRepo.findAll();
        List<Drink> drinks = drinkRepo.findAll();

        firstMenu.setPizzas(pizzas);
        firstMenu.setDrinks(drinks);

        menuRepo.save(firstMenu);
        return firstMenu;
    }

    public Menu saveMenu(Menu menu) {
        return menuRepo.save(menu);
    }

    public Integer countMenu() {
        return (int) menuRepo.count();
    }

    public Menu findMenuById(Long id) {
        return menuRepo.findById(id).orElse(null);
    }
}
