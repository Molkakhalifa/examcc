package esprit.tn.khalifamolka.Controllers;

import esprit.tn.khalifamolka.entities.Parking;
import esprit.tn.khalifamolka.entities.Personnel;
import esprit.tn.khalifamolka.entities.Zone;
import esprit.tn.khalifamolka.services.IParkingService;
import esprit.tn.khalifamolka.services.IPersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/personnel")
public class Controller {
    @Autowired
    IPersonnelService iPersonnelService;
    //localhost:9090/add

    @PostMapping("personnel/add")
    public Personnel addPersonnel(@RequestBody Personnel p  ) {
        return iPersonnelService.addPersonnel(p);
    }
@GetMapping("personnel/{{id}}")
public List<Personnel> getAllPersonnelByParking(Parking parking){
        return iPersonnelService.getAllPersonnelByParking(parking);
}



    }



