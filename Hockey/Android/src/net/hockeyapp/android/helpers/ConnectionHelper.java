package net.hockeyapp.android.helpers;

import android.annotation.TargetApi;
import android.os.Build;
import android.util.Base64;

import java.net.HttpURLConnection;

/**
 * Created by dlernatovich on 9/5/14.
 */
public class ConnectionHelper {

    @TargetApi(Build.VERSION_CODES.FROYO)
    public static void setAutorizeParameters(HttpURLConnection connection, String username, String password) {
        final String basicAuth = "Basic " + Base64.encodeToString((username + ":" + password).getBytes(),
                Base64.NO_WRAP);
        connection.setRequestProperty("Authorization", basicAuth);
    }
}
