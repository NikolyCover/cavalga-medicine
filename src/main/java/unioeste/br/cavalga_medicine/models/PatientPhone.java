package unioeste.br.cavalga_medicine.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
public class PatientPhone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    @ManyToOne
    @JoinColumn(name = "ddd_id")
    private DDD ddd;

    @ManyToOne
    @JoinColumn(name = "ddi_id")
    private DDI ddi;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
}
