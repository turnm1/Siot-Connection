package anbindung.siot;

/**
 * This are SIOT URL-commands in methode for REST Post & Get
 * Not all methods are used and created!
 * @author Turna
 */
public class SiotCommands {
    
    private final SiotConfig sc = new SiotConfig();
    private String manifest;
    private String config;
    private String data;
    private String nData;
    private String dataFrom;
    private String dataBetween;
    private String sensorList;
    private String key;

    public SiotCommands() {
    }

    // getters
    public String getConfig() {     
        // https://siot.net:12935/getconfig?centerUID=A751-6354-E157-4A05-BDAB-77BB-35E5-2657&sensorUID=65206DBD5B5B465EACBE8BFD8DE92285
        config = sc.getURL()+"/getconfig?centerUID="+sc.getLicence()+"&sensorUID="+sc.getGuid();
        return config;
    }

    public String getData() {
        // https://siot.net:12935/getdata?centerUID=A751-6354-E157-4A05-BDAB-77BB-35E5-2657&sensorUID=65206DBD5B5B465EACBE8BFD8DE92285
        data = sc.getURL()+"/getdata?centerUID="+sc.getLicence()+"&sensorUID="+sc.getGuid();
        return data;
    }

    public String getDataBetween() {
        String x = "1480955604216"; // Zeit Stempel 1
        String y = "1480955604217"; // Zeit Stempel 2
        // https://siot.net:12280/getdatafrom?centerUID=C62D-0483-2154-4BF9-9B95-F70F-6F9F-65FA&sensorUID=6106eb4e-4e89-49b1-97b8-a10140551eb7&from=1480955604216&to1480955604217
        dataBetween = sc.getURL()+"/getdatafrom?centerUID="+sc.getLicence()+"&sensorUID="+sc.getGuid()+"&from="+x+"&to"+y;
        return dataBetween;
    }

    public String getDataFrom() {
        // https://siot.net:12280/getdatafrom?centerUID=C62D-0483-2154-4BF9-9B95-F70F-6F9F-65FA&sensorUID=6106eb4e-4e89-49b1-97b8-a10140551eb7&from=1480955604216
        String x = "1480955604216"; // Zeit Stempel
        dataFrom = sc.getURL()+"/getdatafrom?centerUID="+sc.getLicence()+"&sensorUID="+sc.getGuid()+"&from="+x;
        return dataFrom;
    }

    public String getManifest() {
        // https://siot.net:12935/getmanifest?sensorUID=65206DBD5B5B465EACBE8BFD8DE92285
        manifest = sc.getURL()+"/getmanifest?sensorUID="+sc.getGuid();
        return manifest;
    }

    public String getSensorList() {
        // https://siot.net:12280/getsensor?centerUID=C62D-0483-2154-4BF9-9B95-F70F-6F9F-65FA
        sensorList = sc.getURL()+"/getsensor?centerUID="+sc.getLicence();
        return sensorList;
    }

    public String getnData() {
        // https://siot.net:12935/getdatalastn?centerUID=A751-6354-E157-4A05-BDAB-77BB-35E5-2657&sensorUID=65206DBD5B5B465EACBE8BFD8DE92285&count=10
        nData = sc.getURL()+"/getdatalastn?centerUID="+sc.getLicence()+"&sensorUID="+sc.getGuid()+"&count=10";
        return nData;
    }
    
    // setters
    public void setConfig(String config) {
        // https://siot.net:12935/mqtt/request?topic=siot/CNF/A751-6354-E157-4A05-BDAB-77BB-35E5-2657/65206DBD5B5B465EACBE8BFD8DE92285&message={"storage":"db"}
        String storage = "storage";
        String db = "db";
        config = sc.getURL()+"/mqtt/request?topic=siot/CNF/"+sc.getLicence()+"/"+sc.getGuid()+"&message={"+storage+":"+db+"}";
        this.config = config;
    }
     
    public String setData(String data) {
        
        // message=true&topic=siot/DAT/C62D-0483-2154-4BF9-9B95-F70F-6F9F-65FA/0000-0000-0000-000A-0015-BC00-2F00-09CA
        String setData = "message="+data+"&topic=siot/DAT/"+sc.getLicence()+"/"+sc.getGuid();
        return setData;
    }

    public void setDataBetween(String dataBetween) {
        this.dataBetween = dataBetween;
    }

    public void setDataFrom(String dataFrom) {
        this.dataFrom = dataFrom;
    }

    public void setManifest(String manifest) {
        this.manifest = manifest;
    }

    public void setSensorList(String sensorList) {
        this.sensorList = sensorList;
    }

    public void setnData(String nData) {
        this.nData = nData;
    }
    
}
