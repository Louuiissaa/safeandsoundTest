package com.safeandsound.app.safeandsoundtest.model;

import java.util.ArrayList;

/**
 * Created by louisapabst on 01.05.17.
 */

public class User {

    //Attribute
    private long id;
    private String name;
    private String email;
    private String ipRP;
    private ArrayList<Sensor> sensors;

    //Konstruktor
    public User(long id, String name, String email, String ipRP, ArrayList<Sensor> sensors){
        this.id = id;
        this.name = name;
        this.email = email;
        this.ipRP = ipRP;
        this.sensors = sensors;
    }

    //Getter & Setter

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIpRP() {
        return ipRP;
    }

    public void setIpRP(String ipRP) {
        this.ipRP = ipRP;
    }

    public ArrayList<Sensor> getSensors() {
        return sensors;
    }

    public void setSensors(ArrayList<Sensor> sensors) {
        this.sensors = sensors;
    }
}
