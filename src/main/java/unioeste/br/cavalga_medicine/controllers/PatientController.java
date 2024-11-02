package unioeste.br.cavalga_medicine.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unioeste.br.cavalga_medicine.models.MedicalExam;
import unioeste.br.cavalga_medicine.models.Patient;
import unioeste.br.cavalga_medicine.service.PatientService;
import unioeste.br.cavalga_medicine.views.*;

@RestController
@RequestMapping("/patient")
@AllArgsConstructor
public class PatientController {

    private final PatientService patientService;

    @Autowired
    private PatientView patientView;

    @Autowired
    private PatientPhoneView patientPhoneView;

    @Autowired
    private PatientEmailView patientEmailView;

    @Autowired
    private MedicalAppointmentView medicalAppointmentView;

    @Autowired
    private MedicalExamView medicalExamView;

    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable Long id) {
        Patient patient = patientService.getPatientById(id);
        return ResponseEntity.ok(patient);
    }

    public void handleGetPatientById(){
        String code = patientView.input("Digite o número do paciente: ");
        Patient patient = patientService.getPatientById(Long.parseLong(code));

        patientView.showPatinet(patient);
        patientEmailView.showPatientEmails(patient.getPatientEmails().stream().toList());
        patientPhoneView.showPatientPhones(patient.getPatientPhones().stream().toList());
        medicalAppointmentView.showMedicalAppointments(patient.getMedicalAppointments().stream().toList());
        medicalExamView.showMedicalExam(patient.getMedicalExams().stream().toList());
    }
}

