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

    @Override
    public String toString() {
        return String.format("%s - %s", code, name );
    }
}
