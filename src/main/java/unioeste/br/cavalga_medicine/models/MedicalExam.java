package unioeste.br.cavalga_medicine.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
public class MedicalExam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private String observations;

    @ManyToOne
    @JoinColumn(name = "result_id")
    private ExamResult result;

    @ManyToOne
    @JoinColumn(name = "exam_type_id")
    private ExamType type;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    @JsonBackReference
    private Patient patient;
}
