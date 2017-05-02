package com.safeandsound.app.safeandsoundtest.model.sensors;

import com.safeandsound.app.safeandsoundtest.model.Sensor;

/**
 * Created by louisapabst on 01.05.17.
 */

public class DS18B20 extends Sensor {
    //Attribute
    private String topic;

    //Konstruktor
    public DS18B20(String topic){
        super();
        this.topic = topic;
    }

    //Getter & Setter
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
