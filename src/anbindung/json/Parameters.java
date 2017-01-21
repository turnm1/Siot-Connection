/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anbindung.json;

/**
 *
 * @author Turna
 */
public class Parameters {
    
    // Parameters for Author Class
    // ****EDIT**** SET your Company in 
    private String responsiblePerson = "Mete Turna";
    private String companyName = "INTRAAL";
    private String companyLicence = "0000-0000-0100-0000";
    private String telefon = "078 831 23 64";
    private String email = "mete.turna@intraal.com";
    
    // Parameters for Device Class
    private String deviceID = "0";
    private String room = "0";
    private String dTopic  = "0";
    
    // Parameters for Sensor Class
    private String sensorUID = "0";
    private String sTopic  = "0";
 
    // Parameters for Center Class
    private String buildID  = "0";
    private String userID = "0";
    private boolean privacy = true;
    
    // Parameters for Manifest Class
    private String sensorName = "0";
    private String desc = "0";
    private String status = "0";
    private String value = "0";
    private String unite = "0";
    private String valueType = "0";
    private String date = "0";
    private String time = "0";
    private int code = 1;

    public void setBuildID(String buildID) {
        this.buildID = buildID;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    public void setPrivacy(boolean privacy) {
        this.privacy = privacy;
    }

    public void setSensorUID(String sensorUID) {
        this.sensorUID = sensorUID;
    }

    public void setCompanyLicence(String companyLicence) {
        this.companyLicence = companyLicence;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public void setdTopic(String dTopic) {
        this.dTopic = dTopic;
    }

    public void setsTopic(String sTopic) {
        this.sTopic = sTopic;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSensorUID() {
        return sensorUID;
    }

    public String getBuildID() {
        return buildID;
    }

    public int getCode() {
        return code;
    }
  
    public boolean getPrivacy() {
        return privacy;
    }

    public String getUnite() {
        return unite;
    }
    
    public String getCompanyLicence() {
        return companyLicence;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getDate() {
        return date;
    }

    public String getDesc() {
        return desc;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public String getEmail() {
        return email;
    }

    public String getSensorName() {
        return sensorName;
    }

    public String getValue() {
        return value;
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public String getRoom() {
        return room;
    }

    public String getStatus() {
        return status;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getTime() {
        return time;
    }

    public String getUserID() {
        return userID;
    }

    public String getValueType() {
        return valueType;
    }

    public String getdTopic() {
        return dTopic;
    }

    public String getsTopic() {
        return sTopic;
    }

    
}
