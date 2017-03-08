package com.company;

/**
 * Created by ian on 08/03/2017.
 */

/**
 * Car is a subclass of Vehicle and inherits all variables and methods of vehicle
 */
public class Car extends Vehicle {
    private boolean mIsManual;
    private  int mGears;


    public Car(String engine, String name, int speed, int direction, int wheel, int weight, int velocity, boolean isManual, int gears) {
        super(engine, name, speed, direction, 4, weight, velocity);
        mIsManual = isManual;
        mGears = gears;
    }


    public void drive(){

    }

    public  void changeGear(int gear){
        mGears = gear;
        System.out.println("Car.setCurrentGear(): Changed to " + mGears + " gear.");

    }

    /**
     * Calls move method of vehicle to set the speed and direction
     * @param speed
     * @param direction
     */
    public  void changeVelocity( int speed, int direction){
        move(speed,direction);
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
    }
}
