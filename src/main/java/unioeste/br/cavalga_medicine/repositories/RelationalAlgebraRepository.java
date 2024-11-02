package unioeste.br.cavalga_medicine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import unioeste.br.cavalga_medicine.models.Patient;

import java.util.List;

public interface RelationalAlgebraRepository extends JpaRepository<Patient, Long> {
    @Query(value = "SELECT * FROM patient, medical_exam", nativeQuery = true)
    List<Object[]> fintPatientAndMedicalExamCartesianProduct();

    @Query(value = "SELECT patient_id FROM medical_appointment UNION SELECT patient_id FROM medical_exam", nativeQuery = true)
    List<Long> findPatientsFromAppointmentsAndExams();

    @Query(value = "SELECT patient_id FROM medical_appointment WHERE patient_id NOT IN (SELECT patient_id FROM medical_exam)", nativeQuery = true)
    List<Long> findPatientsFromAppointmentsAndNotExams();

    @Query(value = "SELECT * FROM patient NATURAL LEFT JOIN medical_exam", nativeQuery = true)
    List<Object[]> fintPatientsAndMedicalExams();
}
