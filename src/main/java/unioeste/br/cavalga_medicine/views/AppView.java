package unioeste.br.cavalga_medicine.views;

import org.springframework.stereotype.Component;

@Component
public class AppView extends ViewUtils {
    public void showMenu(){
        super.showMenu(
                "[0] - Sair",
                "[1] - Buscar paciente",
                "[2] - Realizar um produto cartesiano entre Paciente e Exame médico",
                "[3] - Mostrar nro dos pacientes que realizaram consulta médica e/ou exame médico (UNION)",
                "[4] - Mostrar nro dos pacientes que realizaram consulta médica mas não exame médico (DIFERENÇA)",
                "[5] - Mostrar pacientes e seus exames médicos (Junção natural)"
        );
    }
}
