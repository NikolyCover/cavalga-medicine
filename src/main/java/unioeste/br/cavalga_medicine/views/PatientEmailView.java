package unioeste.br.cavalga_medicine.views;

import org.springframework.stereotype.Component;
import unioeste.br.cavalga_medicine.models.PatientEmail;

import java.util.List;
import java.util.function.Function;

@Component
public class PatientEmailView extends ViewUtils {
    public void showPatientEmails(List<PatientEmail> patientEmails){
        List<String> headers = List.of("Endereço");

        Function<PatientEmail, List<String>> renderRow = (patientEmail) -> List.of(
                patientEmail.getEmailAddress()
        );

        System.out.println("\nEmails: ");
        showTable(headers, patientEmails, renderRow);
    }
}
