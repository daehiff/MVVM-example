package org.openjfx;

import java.util.ArrayList;
import java.util.Random;

public class Model {

    private static Model instance;

    private ArrayList<String> saidPhrases = new ArrayList<>();


    private Model() {
    }


    public static Model getInstance() {
        if (Model.instance == null)
            Model.instance = new Model();
        return Model.instance;
    }


    public boolean waseverSaid(String message) {
        for (String phrase : saidPhrases) {
            if (phrase.toLowerCase().equals(message.toLowerCase())) {
                saidPhrases.add(message);
                return true;
            }
        }
        saidPhrases.add(message);
        return false;
    }
}




