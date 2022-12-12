package esprit.tn.khalifamolka.repository;
import esprit.tn.khalifamolka.entities.Personnel;
import esprit.tn.khalifamolka.entities.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonnelRepo extends JpaRepository<Personnel,Integer> {


    int countByZone();

}
