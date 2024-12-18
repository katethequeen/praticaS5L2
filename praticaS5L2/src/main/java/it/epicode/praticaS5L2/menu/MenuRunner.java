package it.epicode.praticaS5L2.menu;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MenuRunner implements ApplicationRunner {
    private final MenuService menuService;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
        Menu menu = menuService.createAndSave();
        menu.printMenu();
    }
}
