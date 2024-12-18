package it.epicode.praticaS5L2.menu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MenuConfig {
    @Bean(name = "firstMenu")
    public Menu firstMenu() {
        Menu firstMenu = new Menu();
        firstMenu.setName("FirstMenu");
        return firstMenu;
    }
}
