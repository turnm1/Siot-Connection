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
public class Device {

    @SerializedName("topic")
    @Expose
    private String topic;
    @SerializedName("deviceID")
    @Expose
    private String deviceID;
    @SerializedName("room")
    @Expose
    private String room;
   

    public void setRoom(String room) {
        this.room = room;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getRoom() {
        return room;
    }

    public String getTopic() {
        return topic;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public Device(String deviceID, String room, String topic) {
        this.deviceID = deviceID;
        this.room = room;
        this.topic = topic;
    }
    
}
