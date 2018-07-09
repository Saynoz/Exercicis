/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package application.dto;

import domain.Rocket;
import java.util.Arrays;


public class RocketDTO {
    
   private String id;
    private int[] Engine;

  
    public RocketDTO(Rocket rocket) {
        this.id=rocket.getId();
        this.Engine =rocket.getEngine();
    }

    public String getId() {
        return id;
    }

    public int[] getEngine() {
        return Engine;
    }
    

}
