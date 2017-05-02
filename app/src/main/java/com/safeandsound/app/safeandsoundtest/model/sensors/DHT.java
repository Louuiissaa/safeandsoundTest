package com.safeandsound.app.safeandsoundtest.model.sensors;

import com.safeandsound.app.safeandsoundtest.model.Sensor;

/**
 * Created by louisapabst on 01.05.17.
 */

public class DHT extends Sensor {

    //Attributes
    private long id;
    private String sensorModel;
    private String pinNumbering;
    private long pinNumber;

    //Konstruktor
    public DHT(String name, String sensorModel, String pinNumbering, long pinNumber){
        super();
        this.sensorModel = sensorModel;
        this.pinNumbering = pinNumbering;
        this.pinNumber = pinNumber;
    }

    //Getter & Setter
    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getSensorModel() {
        return sensorModel;
    }

    public void setSensorModel(String sensorModel) {
        this.sensorModel = sensorModel;
    }

    public String getPinNumbering() {
        return pinNumbering;
    }

    public void setPinNumbering(String pinNumbering) {
        this.pinNumbering = pinNumbering;
    }

    public long getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(long pinNumber) {
        this.pinNumber = pinNumber;
    }
}
