package framework.specification;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpecifications {
    public static ResponseSpecification statusCode200() {
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
    }
}
