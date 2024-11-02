package unioeste.br.cavalga_medicine.views;

import org.springframework.stereotype.Component;
import unioeste.br.cavalga_medicine.models.MedicalExam;

import java.util.List;
import java.util.function.Function;

@Component
public class MedicalExamView extends ViewUtils {
    public void showMedicalExam(List<MedicalExam> medicalExams){
        List<String> headers = List.of("Nro exame", "Data exame", "Tipo exame", "Resultado geral", "Observações");

        Function<MedicalExam, List<String>> renderRow = (medicalExam) -> List.of(
                medicalExam.getId().toString(),
                medicalExam.getDate().toString(),
                medicalExam.getType().toString(),
                medicalExam.getResult().toString(),
                medicalExam.getObservations()
        );

        System.out.println("\nExames realizados: ");
        showTable(headers, medicalExams, renderRow);
    }
}
