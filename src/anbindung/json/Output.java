package anbindung.json;
/**
 *
 * @author Turna
 * 
 * This Class is not finished, we dont use it for TestGET.java or TestPOST.java
 * This class should generate the TestGet Parameters to Objekts
 * 
 */
import java.io.IOException;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Output {

    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        BufferedReader br = null;

        
                try{
                    br = new BufferedReader(new FileReader("input.json"));
                    Result result = gson.fromJson(br, Result.class);
                    
                    if (result != null){
                        for (Input i : result.getInputSensor()){
                            System.out.println(i.getSensor().getSensorUID());
                        }
                    }
                } catch (FileNotFoundException e){
                    e.printStackTrace();
                } finally {
                    if (br != null){
                        try {
                            br.close();
                        } catch (IOException e){
                            e.printStackTrace();
                        }
                    }
                }
    }
}