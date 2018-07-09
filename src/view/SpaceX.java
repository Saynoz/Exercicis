/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import application.RocketController;
import application.dto.RocketDTO;
import java.util.Arrays;

public class SpaceX {

    static RocketController controller = new RocketController();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        controller.createRocket("32WESSDS", new int[]{10, 30, 80});
        controller.createRocket("LDSFJA32", new int[]{30, 40, 50, 50, 30, 10});

        printRockets();

        //TimeUnit.MILLISECONDS.sleep(500);
    }

    public static void printRockets() {
        for (RocketDTO i : controller.getRocket()) {
            System.out.println(FormatString(i));
        }
    }

    public static String FormatString(RocketDTO i) {
        String result;
        result = String.format("%s\t||\t%s  kN\n", i.getId(), Arrays.toString(i.getEngine()));
        return result;
    }
}
