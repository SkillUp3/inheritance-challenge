package com.company;

/**
 * Created by idejesus on 07/03/2017.
 */
public class Car extends Vehicle {

    private int mDoors;
    private boolean mIsManual;
    private int mGears;
    private int mWheels;

    public Car(String motor, String name, int numberOfPeopleAccomodate, int currentVelocity, int currentDirection, int doors, boolean isManual, int gears, int wheels) {
        super(motor, name, numberOfPeopleAccomodate, currentVelocity, currentDirection);
        mDoors = doors;
        mIsManual = isManual;
        mGears = gears;
        mWheels = wheels;
    }

    public int getDoors() {
        return mDoors;
    }

    public void setDoors(int doors) {
        mDoors = doors;
    }

    public boolean isManual() {
        return mIsManual;
    }

    public void setManual(boolean manual) {
        mIsManual = manual;
    }

    public int getGears() {
        return mGears;
    }

    public void setGears(int gears) {
        mGears = gears;
    }

    public int getWheels() {
        return mWheels;
    }

    public void setWheels(int wheels) {
        mWheels = wheels;
    }
    public void changeGear(int gear){
        mGears = gear;
        System.out.println("Gear change to " + mGears );
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
         if(newVelocity == 0){
             stop();
             changeGear(1);
         }else if(newVelocity > 0 && newVelocity <= 10){
             changeGear(1);
         }else if(newVelocity > 10 && newVelocity <= 20){
             changeGear(2);
         }else if(newVelocity > 20 && newVelocity <= 30){
             changeGear(3);
         }else {
             changeGear(4);
         }

         if(newVelocity >0){
             changeVelocity(newVelocity, getCurrentDirection());
         }
    }
}
