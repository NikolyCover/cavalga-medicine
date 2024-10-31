package unioeste.br.cavalga_medicine.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

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
}
