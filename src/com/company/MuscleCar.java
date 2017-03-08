package com.company;

/**
 * Created by ian on 08/03/2017.
 */
public class MuscleCar extends Car {

    public MuscleCar(String name, int speed, int direction, int wheel, int weight, int velocity, boolean isManual, int gears) {
        super("v8", name, speed, direction, wheel, weight, velocity, isManual, gears);
    }

    /**
     * Change gear value based on velocity
     * @param rate
     */
    public  void accelerate(int rate){
        int newVelocity = getVelocity() + rate;

        if (newVelocity == 0){
            System.out.println("stop");
            changeGear(1);
        } else if(newVelocity >0 && newVelocity <=10) {
            changeGear(1);
        } else if(newVelocity >10 && newVelocity <=20) {
            changeGear(2);
        } else if(newVelocity >20 && newVelocity <=30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        //sets the velocity and direction of the car
        if(newVelocity > 0) {
            //change velocity in car ctrl+click the changeVelocity method
            changeVelocity(newVelocity, getDirection());
        }


    }
}
