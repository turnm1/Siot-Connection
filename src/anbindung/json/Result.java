
package anbindung.json;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class Result {

@SerializedName("sensorInput")
@Expose
private List<Input> inputSensor = new ArrayList<Input>();

public List<Input> getInputSensor() {
return inputSensor;
}

public void setInputSensor(List<Input> inputSensor) {
this.inputSensor = inputSensor;
}

}
