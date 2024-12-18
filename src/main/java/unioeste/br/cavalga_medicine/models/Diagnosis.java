package unioeste.br.cavalga_medicine.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
public class Diagnosis {
    @Id
    private String code;
    private String description;

    @Override
    public String toString() {
        return String.format("%s - %s", code, description );
    }
}
