package TestCases;

import Pojo.LoginPojo;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class TestCasePost
{
    @Test
    public void goTocourseInfoe()
    {
        File bodyfile =new File("src/test/resources/Login.json");
        File uploadfile=new File("src/test/resources/Login.json");
        HashMap<String,String> headerss=new HashMap<>();
        headerss.put("id","2");
        Header headerobj=new Header("","");
        Headers headersobj=new Headers(headerobj,headerobj,headerobj);
        HashMap<String,String> Body=new HashMap<>();
        LoginPojo pojo=new LoginPojo("sondos","email");
        pojo.setEmail("dodo@gmail.com");
        pojo.setName("sondos");
        Body.put("","");
        given().
                // must be to inform that body have json not string without it will be error
                contentType(ContentType.JSON).
                baseUri("").
                //pass body as String
                body("{\n" +
                        "    \"name\": \"dod\",\n" +
                        "    \"email\": \"sondosjdjj@gmail.com\",\n" +
                        "    \"gender\": \"male\",\n" +
                        "    \"status\": \"active\"\n" +
                " }").
                //pass body from file
               body(bodyfile).
                //pass body from java object "hash map" as json file "must use jackson dependency
                body(Body).
                //pass body from java object "object from class" as json file "must use jackson dependency
                body(pojo).
                //when i want to pass body from file
                multiPart(uploadfile).
                //token"authorization way 1
                header("Authorization","Bearer 43afb5b858c0e581db0fef6b911e6cc225cc07e2a1276d8c728e96e40e8db35b").
                //token"authorization way 2
                auth().oauth2("43afb5b858c0e581db0fef6b911e6cc225cc07e2a1276d8c728e96e40e8db35b") .
        when()
                .post().
        then()
                .log().all()
                .assertThat()
                .statusCode(200);


    }
}
