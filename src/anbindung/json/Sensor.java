/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anbindung.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 *
 * @author Turna
 */
public class Sensor {
    
    @SerializedName("manifest")
    @Expose
    private Manifest manifest;
    @SerializedName("topic")
    @Expose
    private String topic;
    @SerializedName("sensorUID")
    @Expose
    private String sensorUID;

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setManifest(Manifest manifest) {
        this.manifest = manifest;
    }

    public void setSensorUID(String sensorUID) {
        this.sensorUID = sensorUID;
    }

    public Manifest getManifest() {
        return manifest;
    }
 
    public String getTopic() {
        return topic;
    }

    public String getSensorUID() {
        return sensorUID;
    }

    public Sensor(String sensorUID, String topic, Manifest manifest) {
        this.manifest = manifest;
        this.topic = topic;
        this.sensorUID = sensorUID;
    }

}

