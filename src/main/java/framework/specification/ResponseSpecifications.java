package framework.specification;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpecifications {
    public static ResponseSpecification statusCode(int statusCode) {
        return new ResponseSpecBuilder()
                .expectStatusCode(statusCode)
                .build();
    }

    public static ResponseSpecification statusCode200() {
        return statusCode(200);
    }

    public static ResponseSpecification statusCode201() {
        return statusCode(201);
    }

    public static ResponseSpecification statusCode400() {
        return statusCode(400);
    }

    public static ResponseSpecification statusCode404() {
        return statusCode(404);
    }
}
