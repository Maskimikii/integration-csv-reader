package util;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PostSender {

    static String urlAddress = "http://localhost:8080/bulk/invoices";

    public static void sendPostRequest(String jsonBody) throws IOException {

        HttpPost postRequest = new HttpPost(urlAddress);
        HttpEntity stringEntity = new StringEntity(jsonBody, ContentType.APPLICATION_JSON);
        postRequest.addHeader("content-type", "application/json");
        postRequest.setEntity(stringEntity);

        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = httpClient.execute(postRequest);

        System.out.println(response.getStatusLine().getStatusCode());
        System.out.println(response.toString());
        System.out.println(response.getEntity().getContent());
    }
}
