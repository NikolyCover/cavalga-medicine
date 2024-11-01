package unioeste.br.cavalga_medicine.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
public class ExamType {
    @Id
    private String code;
    private String name;
}
