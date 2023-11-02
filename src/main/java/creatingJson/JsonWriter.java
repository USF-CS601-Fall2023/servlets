package creatingJson;

import com.google.gson.JsonObject;

public class JsonWriter {
    public static void main(String[] args) {
        JsonObject jsonResponseObject = new JsonObject();
        jsonResponseObject.addProperty("hotelId", "invalid");
        System.out.println(jsonResponseObject.toString());
    }
}

