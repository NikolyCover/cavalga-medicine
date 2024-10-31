package unioeste.br.cavalga_medicine.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate examDate;
    private String observations;

    @ManyToOne
    @JoinColumn(name = "result_id")
    private ExamResult result;

    @ManyToOne
    @JoinColumn(name = "exam_type_id")
    private ExamType type;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
}
