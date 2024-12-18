package it.epicode.praticaS5L2.drink;

import it.epicode.praticaS5L2.item.Item;
import it.epicode.praticaS5L2.menu.IMenuMethods;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Drink extends Item implements IMenuMethods {
    @Override
    public String descrizione() {
        return this.getName();
    }

    @Override
    public String prezzo() {
        return this.getPrice() + "$";
    }

    @Override
    public String calorie() {
        return this.getCalories() + " kcal";
    }
}
