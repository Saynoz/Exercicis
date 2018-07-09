/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repository;

import domain.Rocket;
import java.util.ArrayList;
import java.util.List;


public class RocketRepository {
    
     public static List<Rocket> rocket = new ArrayList<>();
    
    public void addRocket(Rocket rocket) throws Exception{
          if (rocket == null) {
            throw new Exception();
        }
        RocketRepository.rocket.add(rocket);
    }

    public static List<Rocket> getRocket() {
        return rocket;
    }

}
