package Lesson6;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;


public class Main {
    public static void main(String[] args) {

        HttpClient httpClient = new HttpClient();

        HttpUR url = new HttpURL.Builder()
                .scheme ("https://")
                .host("accuweather.com")
                .addPathSegment("ru")
                .addPathSegment("ru")
                .addPathSegment("saint-petersburg")
                .addPathSegment("295212")
                .addPathSegment("hourly-weather-forecast")
                .addPathSegment("295212")
                .build ();


        HttpRequest httpRequest = new HttpRequest.Builder()
                .url (url)
                .get()
                .build();

        Response response = httpClient.newCall(httpRequest).execute();

        String body = response.body().string();


    }
}
