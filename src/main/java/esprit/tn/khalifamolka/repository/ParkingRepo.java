package esprit.tn.khalifamolka.repository;

import esprit.tn.khalifamolka.entities.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepo extends JpaRepository<Personnel,Long> {
}
