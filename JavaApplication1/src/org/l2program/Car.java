package org.l2program;

import java.util.Objects;

/**
 *
 * @author sander
 */
public class Car {

    private final String name;
    private int nWheels;
    private float wheelWear[];

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car)) {
            return false;
        }
        Car other = (Car) o;
        if (!name.equals(other.name)) {
            return false;
        }
        return nWheels == other.nWheels;
    }
    
    public Acceleratable getAcceleratable() {
        return new Acceleratable() {

            @Override
            public void accelerate() {
                System.out.println("Accelerating my " + nWheels + " wheels");
            }
        };
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + this.nWheels;
        return hash;
    }

    Car(String name) {
        this.name = name;
        nWheels = 4;
        initWheelWear();
    }

    public String getName() {
        return name;
    }

    public void setNWheels(int n) {
        nWheels = n;
        initWheelWear();
    }

    public int getNWheels() {
        return nWheels;
    }

    private void initWheelWear() {
        wheelWear = new float[nWheels];
        for (int i = 0; i < wheelWear.length; i++) {
            wheelWear[i] = 0.0f;
        }
    }
}
