package com.company;

/**
 * Created by ian on 08/03/2017.
 */
public class Vehicle {
    // car, truck  motorycyle,  jeepney
    // engine, name, speed, direction, wheel, weight,
    //transport, steer, changevelocity(speed and direction)

    private String mEngine;
    private String mName;
    private int mSpeed;
    private int mDirection;
    private int mWheel;
    private int mWeight;
    private int mVelocity;



    public Vehicle(String engine, String name, int speed, int direction, int wheel, int weight, int velocity) {
        mEngine = engine;
        mName = name;
        mSpeed = speed;
        mDirection = direction;
        mWheel = wheel;
        mWeight = weight;
        mVelocity = velocity;
    }

    public void transport(){

    }

    /**
     * Change the direction of the vehicle
     * @param direction
     */
    public void steer(int direction){
        mDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + mDirection + " degrees.");

    }

    /**
     * Sets the velocity and direction of the vehicle
     * @param velocity
     * @param direction
     */
    public void move(int velocity, int direction){
        mVelocity = velocity;
        mDirection = direction;

        System.out.println("Vehicle.move(): Moving at  " + mVelocity + " in direction " + mDirection);

    }

    public int getDirection() {
        return mDirection;
    }

    public void setDirection(int direction) {
        mDirection = direction;
    }

    public int getVelocity() {
        return mVelocity;
    }

    public void setVelocity(int velocity) {
        mVelocity = velocity;
    }
    public void stop(){
        mVelocity = 0;
    }
}
