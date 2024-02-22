package com.Tests;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
public class TestCase
{
    @Test
    public void test()
    {
        //without using import static
        RestAssured.given().when().then();
        //when use import static
            given().baseUri("https://65c9ff973b05d29307df7186.mockapi.io/") // anything that send with request(body,header,parameters,auth)
                .when().get("users")  // action http method(get , post , delete,...)
                .then().log().all();// outcome of request "Response"(body , cookies, status code....)

        Response response=RestAssured.given().log().all().contentType(ContentType.JSON)
                .get();

/*******************************************ExtractResponse************************************************************************
 Response response=given().baseUri("https://65c9ff973b05d29307df7186.mockapi.io/")
 .when().get("users")
 .then().log().all()
 .extract().response();
 response.path([0].name); -> return name at object1 at json file
 jsonpath obj=response.jsonpath();-> return name at object1 at json file
 obj.get("[0].name")
//************************************Assertion RestAssured******************************************************************
               /* .assertThat().statusCode(200)
                    assertThat().body("name",hasItem("Ms. Keith Blick"))
                    .assertThat().body("name",hasItems("Ms. Keith Blick","Garry Klein"))
                    .assertThat().body("name",not(hasItem("dodo")))
                    .assertThat().body("name",hasSize(51))
                    .assertThat().body("name.size()",equalTo(51))
                    .assertThat().body("createdAt",everyItem(startsWith("2024")))
                    .assertThat().body("[0]",hasKey("name"))
                    .assertThat().body("[0]",hasValue("1"))
                    .assertThat().body("[0]",hasEntry("id","1"));

        //.assertThat().body("id",empty());
        //.assertThat().body("id",Not(empty()));
        // .assertThat().body("name",contains("must write All Names With order otherwise this case will fail"));
        // .assertThat().body("name",containsAnyOrder("must write All Names"must" Without orders  3ady gdn otherwise this case will fail"));
        //.assertThat().body("[0].name",is(equals("Garry Klein")));*/



    }
}
