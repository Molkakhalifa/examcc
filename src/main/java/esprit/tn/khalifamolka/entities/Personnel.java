package esprit.tn.khalifamolka.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="PERONNEL")
public class Personnel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private String nom;
    private  int age ;
    private String login;
    private String paasword;
    private String prenom;

    @Temporal(TemporalType.DATE)
    private Date dateRecrutement;
    @Enumerated(EnumType.STRING)
    private Poste poste;
    @OneToOne
    private Zone zone;


}
