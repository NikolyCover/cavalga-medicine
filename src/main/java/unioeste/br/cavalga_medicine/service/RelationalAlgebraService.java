package unioeste.br.cavalga_medicine.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import unioeste.br.cavalga_medicine.repositories.RelationalAlgebraRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class RelationalAlgebraService {

    private final RelationalAlgebraRepository relationalAlgebraRepository;

    public List<Object[]> getPatientAndMedicalExamCartesianProduct() {
        return  relationalAlgebraRepository.fintPatientAndMedicalExamCartesianProduct();
    }

    public List<Long> getPatientsFromAppointmentsAndExams() {
        return  relationalAlgebraRepository.findPatientsFromAppointmentsAndExams();
    }

    public List<Long> getPatientsFromAppointmentsAndNotExams() {
        return  relationalAlgebraRepository.findPatientsFromAppointmentsAndNotExams();
    }

    public List<Object[]> getPatientsAndMedicalExams() {
        return  relationalAlgebraRepository.fintPatientsAndMedicalExams();
    }

}
