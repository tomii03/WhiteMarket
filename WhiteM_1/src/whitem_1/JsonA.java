/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whitem_1;

import org.json.*;
import java.nio.file.*;; 
/**
 *
 * @author tomas
 */
public class JsonA {
    public static String readFileAsString(String fileName)throws Exception 
  { 
    String data = ""; 
    data = new String(Files.readAllBytes(Paths.get(fileName))); 
    return data; 
  } 
  
  public JSONArray leer () throws Exception 
  { 
    String data = readFileAsString("/home/tomas/Escritorio/ejemplo.json"); 
    JSONObject obj = new JSONObject(data);
    JSONArray n = obj.getJSONArray("usuarios");
     return n;
  } 
    
}
    

