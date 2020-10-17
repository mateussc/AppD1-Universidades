package br.usjt.ads20.universities.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Nome: Mateus Santos Carvalho
 * RA: 818229525
 */

public class UniversityNetwork {
    
    public static ArrayList<University> searchUniversities(String url) throws IOException {
        ArrayList<University> universities = new ArrayList<>();
        OkHttpClient client = new OkHttpClient();

        Log.d("UniversityNetwork.searchUniversities:url", url);

        Request request = new Request.Builder().url(url).build();
        Response response = client.newCall(request).execute();


        String json = response.body().string();

        try {
            JSONArray list = new JSONArray(json);
            // JSONArray list = jsonResponse.getJSONObject("json").getJSONArray("");
            for(int i = 0; i < list.length(); i++){
                University university = new University();
                JSONObject item = (JSONObject) list.get(i);

                university.setName(item.getString("name"));
                university.setCountry(item.getString("country"));
                university.setWebPage(item.getJSONArray("web_pages").getString(0));
                university.setAlphaTwoCode(item.getString("alpha_two_code"));
                universities.add(university);
            }

        } catch (JSONException e) {
            e.printStackTrace();
            throw new IOException(e);
        }

        return universities;
    }

    public static boolean isConnected(Context context){
        ConnectivityManager manager =
                (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        return manager.getActiveNetworkInfo() != null &&
                manager.getActiveNetworkInfo().isConnected();
    }
} 