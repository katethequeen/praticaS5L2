package it.epicode.praticaS5L2.pizza;

import it.epicode.praticaS5L2.item.Item;
import it.epicode.praticaS5L2.menu.IMenuMethods;
import it.epicode.praticaS5L2.topping.Topping;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@Entity
public class Pizza extends Item implements IMenuMethods {

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @ToString.Exclude
    private List<Topping> ingredients;

    @Override
    public String descrizione() {
        //Nome pizza
        String nome = this.getName() + " (";
        //+ nome topping
        for(Topping topping : ingredients) {
            nome += topping.getName() + ", ";
        }
        return nome.substring(0, nome.length() - 2) + ")";
    }

    @Override
    public String prezzo() {
        return getPrice() + "$";
    }

    @Override
    public String calorie() {
        return getCalories() + " kcal";
    }
}
