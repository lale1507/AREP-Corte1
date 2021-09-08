package edu.escuelaing.arem.ASE.app;

import com.google.gson.Gson;
import edu.escuelaing.arem.ASE.app.weather.WeatherH;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        port(getPort());
        Gson gson = new Gson();

        get("/clima", WeatherH.handle);

    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set
    }
}