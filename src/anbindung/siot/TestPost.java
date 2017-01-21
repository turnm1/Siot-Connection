package anbindung.siot;

import anbindung.json.Author;
import anbindung.json.Center;
import anbindung.json.Device;
import anbindung.json.Input;
import anbindung.json.Manifest;
import anbindung.json.Parameters;
import anbindung.json.Sensor;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Turna
 */
public class TestPost {

    private final SiotCommands sc = new SiotCommands();
    private final SiotConfig sConfig = new SiotConfig();
    private final String USER_AGENT = "Mozilla/5.0";
    Parameters p = new Parameters();
    private String jsonString;

    public String genJson(ArrayList<anbindung.json.Input> s) {
        JSONObject object = new JSONObject();
        JSONArray array = new JSONArray();
        try {
            object.put("sensorInput", s);
            jsonString = String.valueOf(array.put(object));
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return jsonString;
    }

    public static void main(String[] args) throws Exception {

        TestPost restTest = new TestPost();

        System.out.println("Testing SIOT - Send Https Post request:");
        restTest.sendDataPost();
    }

    // HTTP POST request
    private void sendDataPost() throws Exception {

        ArrayList<Input> input = new ArrayList<>();

        Author author = new Author(p.getResponsiblePerson(), p.getCompanyName(), p.getCompanyLicence(), p.getTelefon(), p.getEmail());
        Center center = new Center(p.getBuildID(), p.getUserID(), p.getPrivacy(), author);
        Device device = new Device(p.getDeviceID(), p.getRoom(), p.getdTopic());
        Manifest manifest = new Manifest(p.getSensorName(), p.getDesc(), p.getStatus(), p.getValue(), p.getUnite(), p.getValueType(), p.getDate(), p.getTime(), p.getCode());
        Sensor sensor = new Sensor(p.getSensorUID(), p.getsTopic(), manifest);

        String url = sConfig.getPostURL();
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        // generation the Json String and send as message in the urlParameter
        input.add(new Input(center, device, sensor));
        genJson(input);
        String urlParameters = sc.setData(jsonString);

        // Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
        System.out.println("Post Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println("Post-Message (URL):" + response.toString());
        System.out.println("Post-Message (JSON):" +jsonString);

    }
}
