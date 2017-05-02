package com.safeandsound.app.safeandsoundtest.model.sensors;

import com.safeandsound.app.safeandsoundtest.model.Sensor;

/**
 * Created by louisapabst on 01.05.17.
 */

public class BMP180 extends Sensor {
    //Attribute
    private String server;
    private String topic;
    private String qos;

    //Konstruktor
    public BMP180(String server, String topic, String qos){
        super();
        this.server = server;
        this.topic = topic;
        this.qos = qos;
    }

    //Getter & Setter
    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getQos() {
        return qos;
    }

    public void setQos(String qos) {
        this.qos = qos;
    }
}
