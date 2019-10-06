package per.an.controller;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class CardControllerTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/create")
          .then()
             .statusCode(201);
    }

}