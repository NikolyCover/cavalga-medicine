package unioeste.br.cavalga_medicine.views;

import org.springframework.stereotype.Component;

@Component
public class AppView extends ViewUtils {
    public void showMenu(){
        super.showMenu(
                "[0] - Sair",
                "[1] - Buscar paciente"
        );
    }
}
