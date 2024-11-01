package unioeste.br.cavalga_medicine.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDate birthDate;
    private String gender;
    private String maritalStatus;
    private String identityDocument;
    private String addressComplement;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY)
    private Set<PatientEmail> patientEmails;

    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY)
    private Set<PatientPhone> patientPhones;

    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY)
    private Set<MedicalExam> medicalExams;

    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY)
    private Set<MedicalAppointment> medicalAppointments;
}
