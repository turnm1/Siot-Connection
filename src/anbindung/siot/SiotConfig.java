package anbindung.siot;

/**
 *
 * This is only for a Testcase. We use a fix Center, Input and Output. 
 * We cant create a Center, Input or Output multiple with this class.
 * Getter and Setter does not evaluation the value.
 * 
 * @author Turna
 */
public class SiotConfig {

    
    // ***EDIT*** PLS set your SIOT-Center Informations here in
    private String centerName = "centerplans02";
    private String URL = "https://siot.net:17730";
    private String licence = "B30F-6A7F-295C-4FAE-A0EB-27BD-AA4B-82B7";
    
    // ***EDIT*** PLS set your SIOT-Center-Input/Output Informations here in
    private String name = "InputTest";
    private String inputKey = "2dd37cfe-2a72-8ba2-9615-a170d288c394";
    private String outputKey = "2dd37cfe-2a72-8ba2-9615-a170d288c394";
    private String inOut = "input";
    private boolean message = true;
    private String desc = "test Input Sensor 1";
    private String dataTyp = "json";
 
    
    public SiotConfig() {
    }

    public void setMessage(boolean message) {
        this.message = message;
    }

    public boolean getMessage() {
        return message;
    }
    
    public String getCenterName() {
        return centerName;
    }
    
    public String getPostURL()  {
        return URL+"/mqtt/request";
    }

    public String getDataTyp() {
        return dataTyp;
    }

    public String getDesc() {
        return desc;
    }

    public String getInOut() {
        return inOut;
    }

    public String getInputKey() {
        inputKey = inputKey.replaceAll("-","");
        return inputKey;
    }
    
    public String getOutputKey() {
        outputKey = outputKey.replaceAll("-","");
        return outputKey;
    }

    public String getName() {
        return name;
    }

    public String getURL() {
        return URL;
    }

    public String getLicence() {
        return licence;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public void setDataTyp(String dataTyp) {
        this.dataTyp = dataTyp;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setInOut(String inOut) {
        this.inOut = inOut;
    }

    public void setInputKey(String inputKey) {
        this.inputKey = inputKey;
    }
    
    public void setOutputKey(String outputKey) {
        this.outputKey = outputKey;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }    

}
