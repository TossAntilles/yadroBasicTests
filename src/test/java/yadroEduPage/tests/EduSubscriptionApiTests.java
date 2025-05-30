package yadroEduPage.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import yadroEduPage.models.SubscritionRequest;
import yadroEduPage.models.SuccessfulSubscriptionResponse;

import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static yadroEduPage.specs.EduSubscriptionRestApiSpec.*;

public class EduSubscriptionApiTests extends TestBase {

    //из-за SmartCaptcha тесты написаны вслепую, с проверкой ответов задизейблены, стоят костыли с проверкой ошибки

    @Feature("Проверка API подписки")
    @DisplayName("Заблокированный капчой - Проверка подписки в блоке промо")
    @Owner("Toss Antilles")
    @Test
    @Disabled
    public void eduPromoSubscriptionAPIest() {

        SubscritionRequest subscritionRequest = new SubscritionRequest();
        subscritionRequest.setEmail("schicksalkreuzung@gmail.com");

        SuccessfulSubscriptionResponse response =
                step("Отправление запроса на подписку в блоке промо", () ->
                        given()
                                .spec(subscriptionHeaders)
                                .body(subscritionRequest)
                                .when()
                                .post("https://edu.yadro.com/api/v1/impulse_pre_register/")
                                .then()
                                .spec(response200)
                                .extract().as(SuccessfulSubscriptionResponse.class)
                );

        step("Проверка наличия успешного ответа", () -> {
            assertThat(response.getMessage()).isEqualTo("");
            assertThat(response.getStatus()).isEqualTo("success");
        });
    }

    @Feature("Проверка API подписки")
    @DisplayName("Заблокированный капчой - Проверка подписки в блоке контактов")
    @Owner("Toss Antilles")
    @Test
    @Disabled
    public void eduContactsSubscriptionAPITest() {

        SubscritionRequest subscritionRequest = new SubscritionRequest();
        subscritionRequest.setEmail("schicksalkreuzung@gmail.com");

        SuccessfulSubscriptionResponse response =
                step("Отправление запроса на подписку в блоке контактов", () ->
                        given()
                                .spec(subscriptionHeaders)
                                .body(subscritionRequest)
                                .when()
                                .post("https://edu.yadro.com/subscribe")
                                .then()
                                .spec(response200)
                                .extract().as(SuccessfulSubscriptionResponse.class)
                );

        step("Проверка наличия успешного ответа", () -> {
            assertThat(response.getMessage()).isEqualTo("");
            assertThat(response.getStatus()).isEqualTo("success");
        });
    }

    @Feature("Проверка API подписки")
    @DisplayName("Мок проверки - Проверка подписки в блоке промо")
    @Owner("Toss Antilles")
    @Test
    public void eduPromoSubscriptionAPIErrorTest() {

        SubscritionRequest subscritionRequest = new SubscritionRequest();
        subscritionRequest.setEmail("schicksalkreuzung@gmail.com");

        //SuccessfulSubscriptionResponse response =
        step("Отправление запроса на подписку в блоке промо", () ->
                given()
                        .spec(subscriptionHeaders)
                        .body(subscritionRequest)
                        .when()
                        .post("https://edu.yadro.com/api/v1/impulse_pre_register/")
                        .then()
                        .spec(response477)
        );
    }

    @Feature("Проверка API подписки")
    @DisplayName("Мок проверки - Проверка подписки в блоке контактов")
    @Owner("Toss Antilles")
    @Test
    public void eduContactsSubscriptionAPIErrorTest() {

        SubscritionRequest subscritionRequest = new SubscritionRequest();
        subscritionRequest.setEmail("schicksalkreuzung@gmail.com");

        //SuccessfulSubscriptionResponse response =
        step("Отправление запроса на подписку в блоке контактов", () ->
                given()
                        .spec(subscriptionHeaders)
                        .body(subscritionRequest)
                        .when()
                        .post("https://edu.yadro.com/subscribe")
                        .then()
                        .spec(response477)
        );
    }
}
