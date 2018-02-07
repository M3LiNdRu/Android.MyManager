package com.caseta.roger.mymanager;

import java.net.URL;
import java.net.HttpURLConnection;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;


/**
 * Created by roger on 22/04/17.
 */

public class RestClient {

    public RestClient() {

    }

    public String Download(String url) {

        String result = new String();

        try {

            URL uri = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) uri.openConnection();
            connection.setDoOutput(true);
            connection.setInstanceFollowRedirects(false);
            connection.setRequestMethod("GET");
            //connection.setRequestProperty("Content-Type", "application/xml");


            OutputStream stream = connection.getOutputStream();
            ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
            stream.write(byteArray.toByteArray());
            result = byteArray.toString();

            connection.getResponseCode();
            connection.disconnect();

        } catch(Exception e) {
            result = e.getMessage();
            return result;
        }

        return result;
    }
}
