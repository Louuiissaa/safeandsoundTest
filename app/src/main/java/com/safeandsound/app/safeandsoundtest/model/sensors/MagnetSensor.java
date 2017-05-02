package com.safeandsound.app.safeandsoundtest.model.sensors;

import com.safeandsound.app.safeandsoundtest.model.Sensor;
import com.safeandsound.app.safeandsoundtest.view.MainActivity;

/**
 * Created by louisapabst on 01.05.17.
 */

public class MagnetSensor extends Sensor {
    //Attrribute
    private String gpio;

    //Konstruktor
    public MagnetSensor(String gpio){
        super();
        this.gpio = gpio;
    }

    //Getter & Setter
    public String getGpio() {
        return gpio;
    }

    public void setGpio(String gpio) {
        this.gpio = gpio;
    }
}
