package com.safeandsound.app.safeandsoundtest.model.sensors;

import com.safeandsound.app.safeandsoundtest.model.Sensor;

/**
 * Created by louisapabst on 01.05.17.
 */

public class SRF extends Sensor {
    //Attribute
    private int pin1;
    private int pin2;

    //Konstruktor
    public SRF(int pin1, int pin2){
        super();
        this.pin1 = pin1;
        this.pin2 = pin2;
    }

    //Getter & Setter
    public int getPin1() {
        return pin1;
    }

    public void setPin1(int pin1) {
        this.pin1 = pin1;
    }

    public int getPin2() {
        return pin2;
    }

    public void setPin2(int pin2) {
        this.pin2 = pin2;
    }
}
