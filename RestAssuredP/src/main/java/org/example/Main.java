package org.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;


public class Main {

    public static void main(String[] args) {

        String baseURL = "https://gorest.co.in/public/v2/";
        String userEndPoint = "users/";
        Map<String,String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer 43afb5b858c0e581db0fef6b911e6cc225cc07e2a1276d8c728e96e40e8db35b");

        Response response = RestAssured.given().log().all().
                contentType(ContentType.JSON).
                headers(headers)
                .body(" {\n" +
                        "    \"name\": \"Ahmed Agarwal\",\n" +
                        "    \"email\": \"test123@ratke.example\",\n" +
                        "    \"gender\": \"male\",\n" +
                        "    \"status\": \"active\"\n" +
                        " }").post(baseURL+userEndPoint);
        response.prettyPrint();
        JsonPath jsonPath = response.jsonPath();
        String id = jsonPath.get("id").toString();

        RestAssured.given().log().all().headers(headers)
            .get(baseURL +userEndPoint+id).prettyPrint();


    }
}