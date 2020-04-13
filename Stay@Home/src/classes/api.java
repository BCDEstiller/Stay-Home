/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

/**
 *
 * @author zslay
 */
public class api {
    
    public static ArrayList<String> countries = new ArrayList<String>();
    private static String LocalRawData;
    public static String Country, WorldCases, WorldDeaths, WorldRecovered, LocalCases, NewCases, LocalDeaths, LocalRecovered;
    
    private static String CovidAPI(String api){
        StringBuilder result = new StringBuilder();     
        try{
            URL _url = new URL(api);
            URLConnection _urlConnect = _url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(_urlConnect.getInputStream()));

            String line;
            
            while((line = bufferedReader.readLine()) != null){
                result.append(line + "\n");
            }
            bufferedReader.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }
    
    public static void SelectedCountry(String country){
        try{
            Country = country;
            LocalRawData = CovidAPI("https://coronavirus-19-api.herokuapp.com/countries/" + country);            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void LocalData(){
        int _cases = LocalRawData.indexOf("cases");
        int _tcases = LocalRawData.indexOf("todayCases");
        int _deaths = LocalRawData.indexOf("deaths");
        int _tdeaths = LocalRawData.indexOf("todayDeaths");
        int _recovered = LocalRawData.indexOf("recovered");
        int _active = LocalRawData.indexOf("active");
        
        LocalCases = LocalRawData.substring(_cases + 7, _tcases - 2);
        NewCases = LocalRawData.substring(_tcases + 12, _deaths - 2);
        LocalDeaths = LocalRawData.substring(_deaths + 8, _tdeaths - 2);
        LocalRecovered = LocalRawData.substring(_recovered + 11, _active - 2);
    }
    
    public static void WorldData(){
        String WorldRawData = CovidAPI("https://coronavirus-19-api.herokuapp.com/all");
        int _cases = WorldRawData.indexOf("cases");
        int _deaths = WorldRawData.indexOf("deaths");
        int _recovered = WorldRawData.indexOf("recovered");
        
        WorldCases = WorldRawData.substring(_cases + 7, _deaths - 2);
        WorldDeaths = WorldRawData.substring(_deaths + 8, _recovered - 2);
        WorldRecovered = WorldRawData.substring(_recovered + 11, WorldRawData.length() - 2); 
    }
    
    public static void CountryList(){
        String List = CovidAPI("https://coronavirus-19-api.herokuapp.com/countries");
        String Update;
        int start, end;
        for(String i: List.split("},"))
            countries.add(i);        
        for(int i = 0; i < countries.size() - 15; i++){                         
            Update = countries.get(i + 8);
            start = Update.indexOf("\":\"");
            end = Update.indexOf("cases");           
            Update = Update.substring(start + 3, end - 3).toUpperCase();
            countries.set(i, Update);
        }        
        for(int i = 0; i < 15; i++)
            countries.remove(countries.size() - 1);        
        Collections.sort(countries); 
        /*
        for(int i =0; i < countries.size(); i++)
            System.out.println(countries.get(i));
        */
    }
}
