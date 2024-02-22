package TestCases;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
public class TestCaseGet
{
    @Test
    public void goTocourseInfoe()
    {
        HashMap<String,String> headerss=new HashMap<>();
        headerss.put("id","2");
        Header headerobj=new Header("","");
        Headers headersobj=new Headers(headerobj,headerobj,headerobj);
        given()
                //Types Of Headers
                .baseUri("").
                header("","").
                header("","").
                headers("key","value","key","value","key","value").
                header(headerobj).
                headers(headersobj).
                //Query Parametres
               // queryParam(headerss).
                queryParams("","","","").
        when()
                .get().
        then()
                .log().all()
                .assertThat()
                   .statusCode(200);


    }
}
