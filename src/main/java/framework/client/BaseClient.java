package framework.client;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public abstract class BaseClient {
    protected Response post(RequestSpecification spec, String endpoint, Object body) {

        return given()
                .spec(spec)
                .body(body)
                .when()
                .post(endpoint)
                .then()
                .extract()
                .response();
    }

    protected Response get(RequestSpecification spec, String endpoint) {

        return given()
                .spec(spec)
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
    }
}
