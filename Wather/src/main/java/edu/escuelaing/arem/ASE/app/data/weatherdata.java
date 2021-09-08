package edu.escuelaing.arem.ASE.app.data;
import java.util.HashMap;


public class weatherdata {
    private static final HashMap<String, String> weatherCache = new HashMap<>();

    public static String searchPlace(String place) {
        return weatherCache.getOrDefault(place, null);
    }

    public static void putPlace(String place, String json) {
        weatherCache.put(place, json);
    }
}
