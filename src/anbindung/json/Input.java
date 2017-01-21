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
public class Input {
    

    @SerializedName("center")
    @Expose
    private Center center;
    @SerializedName("sensor")
    @Expose
    private Sensor sensor;
    @SerializedName("device")
    @Expose
    private Device device;

    public void setCenter(Center center) {
        this.center = center;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public Center getCenter() {
        return center;
    }

    public Device getDevice() {
        return device;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public Input(Center center, Device device, Sensor sensor) {
        this.center = center;
        this.device = device;
        this.sensor = sensor;
    }
    
}
