package viikko3;

import java.util.ArrayList;

public class Safe {
    private String pinCode;
    private ArrayList<String> safeFolder;

    public Safe(String code) {
        this.pinCode = code;
        this.safeFolder = new ArrayList<String>();
    }

    public void setPin(String code) {
        this.pinCode = code;
    }
    public void addSafe (String think) {
        safeFolder.add(think);

    }
    public ArrayList<String> getlist (String code) {
        if (this.pinCode.equals(code)) {
            return safeFolder;
        }
        else {
            ArrayList<String> wrongPin = new ArrayList<String>();
            wrongPin.add("Väärä PIN-koodi!");
            return wrongPin;
        } 
    }
}