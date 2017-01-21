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
public class Manifest {
    
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("sensorName")
    @Expose
    private String sensorName;
    @SerializedName("unite")
    @Expose
    private String unite;
    @SerializedName("valueType")
    @Expose
    private String valueType;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("desc")
    @Expose
    private String desc;

    public void setCode(int manifestCode) {
        this.code = manifestCode;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    public void setDate(String manifestDate) {
        this.date = manifestDate;
    }

    public void setDesc(String manifestDesc) {
        this.desc = manifestDesc;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public void setTime(String manifestTime) {
        this.time = manifestTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }


    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getUnite() {
        return unite;
    }
    
    

    public int getCode() {
        return code;
    }

    public String getDate() {
        return date;
    }

    public String getDesc() {
        return desc;
    }

    public String getSensorName() {
        return sensorName;
    }

    public String getTime() {
        return time;
    }

    public String getStatus() {
        return status;
    }

    public String getValueType() {
        return valueType;
    }



    public Manifest(String sensorName, String desc, String status, String value, String unite, String valueType, String date, String time, int code) {
        this.sensorName = sensorName;
        this.desc = desc;
        this.status = status;
        this.value = value;
        this.unite = unite;
        this.valueType = valueType;
        this.date = date;
        this.time = time;
        this.code = code;
    }
    
     
    
}

