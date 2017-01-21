package anbindung.siot;

import com.google.gson.Gson;
import anbindung.json.Input;
import anbindung.json.Result;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Turna
 */
public class TestGet {

    private SiotCommands sc = new SiotCommands();
    private final String USER_AGENT = "Mozilla/5.0";

    public static void main(String[] args) throws Exception {

        TestGet restTest = new TestGet();
        System.out.println("Testing SIOT - Send Https <getData> request:");
        restTest.sendGetData();

    }

    // convert InputStream to String
    private static String getStringFromInputStream(InputStream is) {

        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();

        String line;
        try {

            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

        } catch (IOException e) {
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
        }

        return sb.toString();

    }
    
    
    private void setStringIntoInputStream(String s) throws IOException{
	String str = s;

	// convert String into InputStream
	InputStream is = new ByteArrayInputStream(str.getBytes());

	// read it with BufferedReader
	BufferedReader br = new BufferedReader(new InputStreamReader(is));

	String line;
	while ((line = br.readLine()) != null) {
		System.out.println("1: "+line);
                
	}
           
    }

    // HTTP GET request
    private void sendGetData() throws Exception {

      String url = sc.getData();
        URL obj = new URL(url);

        // here optimally with try..catch
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("Post Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {//read line by line
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println("Get-Message (URL): " + url);
        System.out.println("Get-Message (JSON): " + response.toString());
    }
}
