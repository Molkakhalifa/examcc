package esprit.tn.khalifamolka.services;

import esprit.tn.khalifamolka.entities.Parking;
import esprit.tn.khalifamolka.entities.Personnel;
import esprit.tn.khalifamolka.entities.Zone;
import esprit.tn.khalifamolka.repository.PersonnelRepo;
import esprit.tn.khalifamolka.repository.ZoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PersonnelServiceimp implements IPersonnelService {

    @Autowired
    PersonnelRepo personnelRepo;
    @Autowired
    ZoneRepo zoneRepo;


    @Override
    public Personnel addPersonnel(Personnel p) {
        return personnelRepo.save(p);
    }


   @Override
    @Scheduled(cron = "*/30 * * * * *")
    public void getNbrGardesByZone() {

         personnelRepo.countByZone();

    }


@Override
        public List<Personnel> getAllPersonnelByParking(Parking parking){

                return personnelRepo.findAll();
            }

            @Override
    public void affecterPersonnelZone(int idZone, int idGarde) {

                Personnel personnel = personnelRepo.findById(idGarde).orElse(null);
                Zone zone = zoneRepo.findById(idZone).orElse(null);

                {
                    personnel.setZone(zone);
                    personnelRepo.save(personnel);
                }
            }

}
