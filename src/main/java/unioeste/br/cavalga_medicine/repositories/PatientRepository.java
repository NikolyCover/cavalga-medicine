package unioeste.br.cavalga_medicine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import unioeste.br.cavalga_medicine.models.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    @Query("SELECT p FROM Patient p " +
            "LEFT JOIN FETCH p.address a " +
            "LEFT JOIN FETCH a.street s " +
            "LEFT JOIN FETCH a.neighborhood n " +
            "LEFT JOIN FETCH a.city c " +
            "LEFT JOIN FETCH c.state st " +
            "LEFT JOIN FETCH p.patientEmails pe " +
            "LEFT JOIN FETCH p.patientPhones pp " +
            "LEFT JOIN FETCH pp.ddd ddd " +
            "LEFT JOIN FETCH pp.ddi ddi " +
            "LEFT JOIN FETCH p.medicalExams me " +
            "LEFT JOIN FETCH me.result mr " +
            "LEFT JOIN FETCH me.type et " +
            "LEFT JOIN FETCH p.medicalAppointments ma " +
            "LEFT JOIN FETCH ma.diagnosis diag " +
            "LEFT JOIN FETCH ma.doctor doc " +
            "WHERE p.id = :id")
    Patient findPatientByIdWithDetails(Long id);
}
