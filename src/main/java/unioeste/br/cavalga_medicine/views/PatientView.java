package unioeste.br.cavalga_medicine.views;

import de.vandermeer.asciitable.AsciiTable;
import org.springframework.stereotype.Component;
import unioeste.br.cavalga_medicine.models.Patient;

@Component
public class PatientView  extends ViewUtils {
    public void showPatinet(Patient patient){
        AsciiTable table = new AsciiTable();

        table.addRule();
        table.addRow("Nro Paciente", patient.getId());
        table.addRule();
        table.addRow("Nome", patient.getName());
        table.addRule();
        table.addRow("Data de Nascimento", patient.getBirthDate());
        table.addRule();
        table.addRow("Sexo", patient.getGender());
        table.addRule();
        table.addRow("Estado civil", patient.getMaritalStatus());
        table.addRule();
        table.addRow("Doc. Identidade", patient.getIdentityDocument());
        table.addRule();
        table.addRow("Endereço", patient.getAddress().toString());
        table.addRule();
        table.addRow("Número do endereço", patient.getAddressNumber());
        table.addRule();
        table.addRow("Complemento", patient.getAddressComplement());
        table.addRule();

        System.out.println(table.render());
    }
}

