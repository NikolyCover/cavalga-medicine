package unioeste.br.cavalga_medicine.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
public class StreetType {
    @Id
    private String abbreviation;
    private String name;
}
