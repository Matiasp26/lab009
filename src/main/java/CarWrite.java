package com.howtodoinjava.demo.jsonsimple;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CarWrite
{
    @SuppressWarnings("unchecked")
    public static void main( String[] args )
    {
        JSONObject carDetails = new JSONObject();
        carDetails.put("Brand", "Audi");
        carDetails.put("Model", "A4");
        carDetails.put("Year", "2023");

        JSONObject carObject = new JSONObject();
        carObject.put("employee", carDetails);

        JSONArray carList = new JSONArray();
        carList.add(carObject);

        try (FileWriter file = new FileWriter("C:\\Users\\cti22c102\\IdeaProjects\\lab009\\src\\main\\java\\Car.txt")) {
            file.write(carList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}