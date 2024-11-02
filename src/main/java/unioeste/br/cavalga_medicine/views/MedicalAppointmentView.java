package unioeste.br.cavalga_medicine.views;

import org.springframework.stereotype.Component;
import unioeste.br.cavalga_medicine.models.MedicalAppointment;

import java.util.List;
import java.util.function.Function;

@Component
public class MedicalAppointmentView extends ViewUtils {
    public void showMedicalAppointments(List<MedicalAppointment> medicalAppointments){
        List<String> headers = List.of("Nro consulta", "Data consulta", "Médico", "Diagnóstico");

        Function<MedicalAppointment, List<String>> renderRow = (medicalAppointment) -> List.of(
                medicalAppointment.getId().toString(),
                medicalAppointment.getDate().toString(),
                medicalAppointment.getDoctor().toString(),
                medicalAppointment.getDiagnosis().toString()
        );

        System.out.println("\nConsultas Médicas realizadas: ");
        showTable(headers, medicalAppointments, renderRow);
    }
}
