package yadroEduPage.specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.with;
import static io.restassured.filter.log.LogDetail.ALL;

public class EduSubscriptionRestApiSpec {

    public static RequestSpecification subscriptionHeaders = with()
            .log().all()
            .contentType(ContentType.JSON);

    public static ResponseSpecification response200 = new ResponseSpecBuilder()
        .expectStatusCode(200)
            .log(ALL)
            .build();

    public static ResponseSpecification response477 = new ResponseSpecBuilder()
            .expectStatusCode(477)
            .log(ALL)
            .build();
}
