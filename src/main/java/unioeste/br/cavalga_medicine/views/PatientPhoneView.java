package unioeste.br.cavalga_medicine.views;

import org.springframework.stereotype.Component;
import unioeste.br.cavalga_medicine.models.PatientPhone;

import java.util.List;
import java.util.function.Function;

@Component
public class PatientPhoneView extends ViewUtils {
    public void showPatientPhones(List<PatientPhone> patientPhones){
        List<String> headers = List.of("DDI", "DDD", "Número");

        Function<PatientPhone, List<String>> renderRow = (patientEmail) -> List.of(
                patientEmail.getDdi().getNumber(),
                patientEmail.getDdd().getNumber(),
                patientEmail.getNumber()
        );

        System.out.println("\nTelefones: ");
        showTable(headers, patientPhones, renderRow);
    }
}
