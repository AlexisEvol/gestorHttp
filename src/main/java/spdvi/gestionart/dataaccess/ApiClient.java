/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spdvi.gestionart.dataaccess;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import spdvi.gestionart.Models.Municipi;

/**
 *
 * @author Alumnat
 */
public class ApiClient {
    
    public ArrayList<Municipi> getMunicipis() throws IOException, InterruptedException{
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://localhost:8080/municipis")).build();
        
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        
        String responseBody = response.body();
        int responseCode = response.statusCode();
        
        if(responseCode == 200){
            
            //Poner un lector de JSON
        }
        
        return null;
    }
    
}
