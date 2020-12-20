package com.pagarbook.utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JSONUtilities {
    public static JSONObject getJSONFileObject(String jsonFilePath) {
        JSONParser jsonParser = new JSONParser();
        Object object = null;
        JSONObject jsonObject = null;
        try {
            object = jsonParser.parse(new FileReader(jsonFilePath));
            jsonObject = (JSONObject) object;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    public static JSONArray getJSONArray(String jsonFilePath) {
        JSONParser jsonParser = new JSONParser();
        Object object = null;
        JSONArray jsonArray = null;
        try {
            object = jsonParser.parse(new FileReader(jsonFilePath));
            jsonArray = (JSONArray) object;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return jsonArray;
    }
}
