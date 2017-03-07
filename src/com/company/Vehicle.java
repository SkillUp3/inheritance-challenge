package com.company;

/**
 * Created by idejesus on 07/03/2017.
 */
public class Vehicle {

    private String mMotor;
    private String mName;
    private int mNumberOfPeopleAccomodate;
    private int mCurrentVelocity;
    private int mCurrentDirection;

    public Vehicle(String motor, String name, int numberOfPeopleAccomodate, int currentVelocity, int currentDirection) {
        mMotor = motor;
        mName = name;
        mNumberOfPeopleAccomodate = numberOfPeopleAccomodate;
        mCurrentVelocity = currentVelocity;
        mCurrentDirection = currentDirection;
    }

    public void travel() {

    }

    public void stop() {

    }

    public void refuel() {

    }

    public void pollute() {

    }

    public String getMotor() {
        return mMotor;
    }

    public void setMotor(String motor) {
        mMotor = motor;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getNumberOfPeopleAccomodate() {
        return mNumberOfPeopleAccomodate;
    }

    public void setNumberOfPeopleAccomodate(int numberOfPeopleAccomodate) {
        mNumberOfPeopleAccomodate = numberOfPeopleAccomodate;
    }

    public void changeVelocity(int velocity, int direction){
        mCurrentDirection = direction;
        mCurrentVelocity = velocity;
        System.out.println("Vehicle moving at" + mCurrentVelocity + " in irection" + mCurrentDirection);


    }

    public void  steer(int direction){
        mCurrentDirection += direction;
        System.out.println("Vehicle.steer()  Steering at " + mCurrentDirection);
    }

    public int getCurrentVelocity() {
        return mCurrentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        mCurrentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return mCurrentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        mCurrentDirection = currentDirection;
    }
}
