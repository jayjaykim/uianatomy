package com.jayjaylab.ui.anatomy.util;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.StringReader;

/**
 * Created by jjkim on 2016. 7. 17..
 */
public class GsonProvider {
    Gson gson;
    static GsonProvider instance;

    private GsonProvider() {
        gson = new Gson();
    }

    public static GsonProvider getInstance() {
        if(instance == null) {
            synchronized (GsonProvider.class) {
                if(instance == null) {
                    instance = new GsonProvider();
                }
            }
        }

        return instance;
    }

    // TODO: 2016. 7. 17.
    public void marshall() {

    }

    public <T> T unmarshall(String text, Class<T> clazz) {
        Objects.requireNonNull(text);

        try {
            return gson.fromJson(text, clazz);
        } catch(Exception e) {
           if(Log.DEBUG) e.printStackTrace();
        }

        return null;
    }

    public <T> T unmarshallByJsonReader(String text, Class<T> clazz) {
        Objects.requireNonNull(text);

        try {
            JsonReader jsonReader = new JsonReader(new StringReader(text));
            jsonReader.setLenient(true);
            return gson.fromJson(jsonReader, clazz);
        } catch (Exception e) {
            if(Log.DEBUG) e.printStackTrace();
        }

        return null;
    }
}
