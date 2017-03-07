package com.company;

/**
 * Created by idejesus on 07/03/2017.
 */
public class SportCar extends Car {

    private boolean mIsTurbo;
    private boolean mIsSuperCharge;
    private boolean mIsTopdown;


    public SportCar(String motor, String name, int numberOfPeopleAccomodate, int currentVelocity, int currentDirection,
                    int doors, boolean isManual, int gears, int wheels, boolean isTurbo, boolean isSuperCharge,
                    boolean isTopdown) {
        super(motor, name, numberOfPeopleAccomodate, currentVelocity, currentDirection, 2, isManual, 7, 4);
        mIsTurbo = isTurbo;
        mIsSuperCharge = isSuperCharge;
        mIsTopdown = isTopdown;
    }
}
