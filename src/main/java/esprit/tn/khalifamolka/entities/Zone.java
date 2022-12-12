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
@Table(name="ZONE")
public class Zone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
 private String ref;
 private float dimension ;
 @ManyToOne
    private Parking parking;
 @OneToOne (mappedBy = "zone")
    private Personnel personnel;
@OneToMany
    private Set<Personnel>personnels;
}
