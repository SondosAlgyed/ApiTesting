package utils;

import java.util.HashMap;
import java.util.Map;

public class Constants {
    public static String baseURL = "https://gorest.co.in/public/v2/";
    public static String userEndPoint = "users/";

    public static Map<String, String> generalHeaders(){
        Map<String,String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer 43afb5b858c0e581db0fef6b911e6cc225cc07e2a1276d8c728e96e40e8db35b");
        return headers;
    }
}
