package unioeste.br.cavalga_medicine.views;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Function;

@Component
public class RelationalAlgebraView extends ViewUtils {

    public void showPatientsAndMedicalExamsCartesianProduct(List<Object[]> patientMedicalExams) {
        List<String> headers = List.of(
                "nro_paciente", "complemento_endereco_paciente", "nro_endereco_paciente", "data_nascimento_paciente", "sexo_paciente",
                "doc_identidade_paciente", "estado_civil_paciente", "nome_paciente", "codigo_endereco_paciente",
                "nro_exame_medico", "data_exame_medico", "observacoes_exame_medico", "nro_paciente_exame_medico",
                "resultado_exame_id_exame_medico", "codigo_tipo_exame_exame_medico"
        );

        Function<Object[], List<String>> renderRow = (row) -> List.of(
                row[0] != null ? row[0].toString() : "-",            // Patient ID
                row[1] != null ? row[1].toString() : "-",            // Address Complement
                row[2] != null ? row[2].toString() : "-",            // Address Number
                row[3] != null ? row[3].toString() : "-",            // Birth Date
                row[4] != null ? row[4].toString() : "-",            // Gender
                row[5] != null ? row[5].toString() : "-",            // Identity Document
                row[6] != null ? row[6].toString() : "-",            // Marital Status
                row[7] != null ? row[7].toString() : "-",            // Name
                row[8] != null ? row[8].toString() : "-",            // Address ID
                row[9] != null ? row[9].toString() : "-",            // Medical Exam ID
                row[10] != null ? row[10].toString() : "-",          // Exam Date
                row[11] != null ? row[11].toString() : "-",          // Observations
                row[12] != null ? row[12].toString() : "-",          // Patient ID (Exam)
                row[13] != null ? row[13].toString() : "-",          // Result ID
                row[14] != null ? row[14].toString() : "-"           // Exam Type ID
        );

        System.out.println("\nProduto cartesiano entre a tabela paciente e exame médico:");

        showTable(headers, patientMedicalExams, renderRow);
    }

    public void showPatientsFromAppointmentsAndExams(List<Long> ids) {
        List<String> headers = List.of("nro_paciente");

        Function<Long, List<String>> renderRow = (id) -> List.of(id.toString());

        System.out.println("\nIDs dos pacientes que fizeram consulta médica e/ou exame médico:");
        showTable(headers, ids, renderRow);
    }

    public void showPatientsFromAppointmentsAndNotExams(List<Long> ids) {
        List<String> headers = List.of("nro_paciente");

        Function<Long, List<String>> renderRow = (id) -> List.of(id.toString());

        System.out.println("\nIDs dos pacientes que fizeram consulta médica e não fizeram exame médico:");
        showTable(headers, ids, renderRow);
    }

    public void showPatientsAndMedicalExams(List<Object[]> patientMedicalExams) {
        List<String> headers = List.of(
                "nro_paciente", "complemento_endereco_paciente", "nro_endereco_paciente", "data_nascimento_paciente", "sexo_paciente",
                "doc_identidade_paciente", "estado_civil_paciente", "nome_paciente", "codigo_endereco_paciente",
                "nro_exame_medico", "data_exame_medico", "observacoes_exame_medico",
                "resultado_exame_id_exame_medico", "codigo_tipo_exame_exame_medico"
        );

        Function<Object[], List<String>> renderRow = (row) -> List.of(
                row[0] != null ? row[0].toString() : "-",            // Patient ID
                row[1] != null ? row[1].toString() : "-",            // Address Complement
                row[2] != null ? row[2].toString() : "-",            // Address Number
                row[3] != null ? row[3].toString() : "-",            // Birth Date
                row[4] != null ? row[4].toString() : "-",            // Gender
                row[5] != null ? row[5].toString() : "-",            // Identity Document
                row[6] != null ? row[6].toString() : "-",            // Marital Status
                row[7] != null ? row[7].toString() : "-",            // Name
                row[8] != null ? row[8].toString() : "-",            // Address ID
                row[9] != null ? row[9].toString() : "-",            // Medical Exam ID
                row[10] != null ? row[10].toString() : "-",          // Exam Date
                row[11] != null ? row[11].toString() : "-",          // Observations
                row[12] != null ? row[12].toString() : "-",          // Result ID
                row[13] != null ? row[13].toString() : "-"           // Exam Type ID
        );

        System.out.println("\nPacientes e exames médicos:");

        showTable(headers, patientMedicalExams, renderRow);
    }
}
