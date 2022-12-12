package esprit.tn.khalifamolka.services;

import esprit.tn.khalifamolka.entities.Parking;
import esprit.tn.khalifamolka.entities.Personnel;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

public interface IPersonnelService {

    Personnel addPersonnel(Personnel p);

    @Scheduled(cron = "*/30 * * * * *")
    void getNbrGardesByZone();

    List<Personnel> getAllPersonnelByParking(Parking parking);

    void affecterPersonnelZone(int idZone, int idGarde);
}
