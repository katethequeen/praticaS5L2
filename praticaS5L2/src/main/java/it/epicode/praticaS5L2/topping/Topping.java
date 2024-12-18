package it.epicode.praticaS5L2.topping;

import it.epicode.praticaS5L2.item.Item;
import it.epicode.praticaS5L2.pizza.Pizza;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
public class Topping extends Item {

}
