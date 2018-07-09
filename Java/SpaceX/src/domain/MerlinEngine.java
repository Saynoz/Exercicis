/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author David Baqués <dbaques@gmail.com>
 */
public class MerlinEngine {

    private int maxPower;
    private static int power;

    public  MerlinEngine(int maxPower) {
        this.maxPower = maxPower;
    }

    public void gainPower() throws InterruptedException {
            power=power+10;
    }

    public int getPower() {
        return power;
    }

}
