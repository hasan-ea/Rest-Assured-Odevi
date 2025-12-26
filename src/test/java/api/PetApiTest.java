package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import model.Pet;
import org.testng.annotations.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

public class PetApiTest {

    @BeforeClass
    public void beforeClass()  {
        RestAssured.baseURI = "https://petstore.swagger.io";
        RestAssured.basePath = "/v2";

    }

    @Test
    public void createPet() {

        Pet newpet = new Pet("Suphi","available");

        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(newpet)
                .when()
                .post("/pet")
                .then()
                .statusCode(200)
                .body("id", notNullValue())
                .body("name", equalTo(newpet.getName()))
                .body("status", equalTo(newpet.getStatus()));
    }

    @AfterClass
    public void afterClass()  {}
}
