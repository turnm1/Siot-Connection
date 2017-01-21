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
    
    // ***EDIT*** PLS set your SIOT-Center-Input Informations here in
    private String name = "InputTest";
    private String guid = "2dd37cfe-2a72-8ba2-9615-a170d288c394";
    private String type = "input";
    private String valueType = "string";
    private String jsonMapping = "";
    private String file = "";
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
        return type;
    }

    public String getValueType() {
        return valueType;
    }

    public String getType() {
        return type;
    }

    public String getJsonMapping() {
        return jsonMapping;
    }

    public String getGuid() {
        guid = guid.replaceAll("-","");
        return guid;
    }

    public String getFile() {
        return file;
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
        this.type = inOut;
    }

    public void setInputKey(String inputKey) {
        this.guid = inputKey;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public void setJsonMapping(String jsonMapping) {
        this.jsonMapping = jsonMapping;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
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
