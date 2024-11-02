package unioeste.br.cavalga_medicine.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
public class Doctor {
    @Id
    private String crm;
    private String name;
    private String email;

    @Override
    public String toString() {
        return String.format("%s, CRM: %s, Contato: %s", name, crm, email );
    }
}

