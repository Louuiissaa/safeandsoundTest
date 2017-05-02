package com.safeandsound.app.safeandsoundtest.model;

/**
 * Created by louisapabst on 01.05.17.
 */

public class Sensor {

    //Attribute
    private long id;
    private String type;
    private String name;

    //Konstruktor
    public Sensor(long id, String type, String name){
        this.id = id;
        this.type = type;
        this.name = name;
    }

    public Sensor(){
        super();
    }

    // Getter & Sensor
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
