/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import application.dto.RocketDTO;
import domain.Rocket;
import java.util.ArrayList;
import java.util.List;
import repository.RocketRepository;


public class RocketController {

    RocketRepository repository = new RocketRepository();

    public void createRocket(String id, int[] Engine) throws Exception {
        Rocket rocket = new Rocket(id, Engine);
        repository.addRocket(rocket);
        
    }
  public void powering(String id, int[] Engine) throws Exception {
        Rocket rocket = new Rocket(id, Engine);
        repository.addRocket(rocket);
        
    }
    
    public List<RocketDTO> getRocket() {
        List<RocketDTO> list = new ArrayList<>();
        for(Rocket i: RocketRepository.getRocket()){
         list.add(new RocketDTO(i));
    }
     return list;
}
}
