import io.microprofile.testing.junit5.MicroProfileTest;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.Application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static io.restassured.RestAssured.given;

@MicroProfileTest
public class ResourceOneTest {

    @Test
    public void testGreet() {
        String name = "John";
        String response = given()
        		.baseUri("http://localhost:9080") // Adjust this if your server is on a different port
            .pathParam("name", name)
            .when()
            .get("/greet/{name}")
            .then()
            .statusCode(200)
            .extract()
            .asString();

        assertEquals("Hello, John!", response);
    }
}