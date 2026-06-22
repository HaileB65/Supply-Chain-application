package models;

import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Entity
@Table(name ="shoes")
@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Address {

    @Id
    @Generated
    private Long id;

    String name;
    String zip;
    String city;
    String state;
    String apt_number;
}
