package framework.specification;

import framework.config.ConfigManager;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecifications {

    public static RequestSpecification baseRequestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(ConfigManager.getBaseUrl())
                .setContentType("application/json")
                .addFilter(new AllureRestAssured())
                .build();
    }

    public static RequestSpecification authorizedRequestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(ConfigManager.getBaseUrl())
                .setContentType("application/json")
                .addHeader(
                        ConfigManager.getAuthHeaderName(),
                        ConfigManager.getTrainerToken()
                )
                .addFilter(new AllureRestAssured())
                .build();
    }
}