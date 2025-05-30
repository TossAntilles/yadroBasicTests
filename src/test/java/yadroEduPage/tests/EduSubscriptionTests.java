package yadroEduPage.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import yadroEduPage.compontnts.EduBlockPage;

public class EduSubscriptionTests extends TestBase {

    //вынес бы в API тесты, но из-за Yandex SmartCaptcha в проде сделать невозможно

    EduBlockPage eduPage = new EduBlockPage();

    @BeforeEach
    public void beforeEach() {
        eduPage.openPage();
    }

    @Feature("Проверка вэб подписки")
    @DisplayName("Мок проверки - Проверка подписки в блоке промо")
    @Owner("Toss Antilles")
    @Test
    public void eduPromoSubscriptionManualTest() {
        eduPage.formInput("Вводим почту в блоке Промо",
                        EduBlockPage.promoSubscribeForm, "testmail@randommail.com")
                .checkboxClick(EduBlockPage.promoConfirmationCheckbox)
                .elementClick("Нажимаем 'отправить' в форме подписки",
                        EduBlockPage.promoSubscribeButton)
                .validateCaptchaAppearance("Так как в проде сабмит защищен капчой, ограничиваемся проверкой её появления",
                        EduBlockPage.captchaForm);
    }

    @Feature("Проверка вэб подписки")
    @DisplayName("Мок проверки - Проверка подписки в блоке контактов")
    @Owner("Toss Antilles")
    @Test
    public void eduContactsSubscriptionManualTest() {
        eduPage.formInput("Вводим почту в блоке контактов",
                        EduBlockPage.contactsSubscribeForm, "testmail@randommail.com")
                .checkboxClick(EduBlockPage.contactsConfirmationCheckbox)
                .elementClick("Нажимаем 'отправить' в форме подписки",
                        EduBlockPage.contactsSubscribeButton)
                .validateCaptchaAppearance("Так как в проде сабмит защищен капчой, ограничиваемся проверкой её появления",
                        EduBlockPage.captchaForm);
    }

}
