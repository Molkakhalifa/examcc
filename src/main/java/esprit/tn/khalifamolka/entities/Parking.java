package esprit.tn.khalifamolka.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="PARKING")
public class Parking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id ;
    private String designation ;
    private String adresse ;
    private int capacite ;
    @OneToMany (mappedBy = "parking")
    private Set<Zone> zone;

}

