package unioeste.br.cavalga_medicine.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import unioeste.br.cavalga_medicine.models.Patient;
import unioeste.br.cavalga_medicine.repository.PatientRepository;

@Service
@AllArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    public Patient getPatientById(Long id) {
        return patientRepository.findPatientByIdWithDetails(id);
    }
}
