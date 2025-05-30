package yadroEduPage.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import yadroEduPage.compontnts.EduBlockPage;

public class EduSubscriptionTests extends TestBase {

    //вынес бы в API тесты, но из-за Yandex SmartCaptcha в проде сделать невозможно

    EduBlockPage eduPage = new EduBlockPage();

    @BeforeEach
    public void beforeEach() {
        eduPage.openPage();
    }

    @Test
    public void eduPromoSubscriptionManual() {
        eduPage.formInput("Вводим почту в блоке Промо",
                        EduBlockPage.promoSubscribeForm, "testmail@randommail.com")
                .checkboxClick(EduBlockPage.promoConfirmationCheckbox)
                .buttonClick("Нажимаем 'отправить' в форме подписки",
                        EduBlockPage.promoSubscribeButton)
                .validateCaptchaAppearance("Так как в проде сабмит защищен капчой, ограничиваемся проверкой её появления",
                        EduBlockPage.captchaForm);
    }

    @Test
    public void eduContactsSubscriptionManual() {
        eduPage.formInput("Вводим почту в блоке контактов",
                        EduBlockPage.contactsSubscribeForm, "testmail@randommail.com")
                .checkboxClick(EduBlockPage.contactsConfirmationCheckbox)
                .buttonClick("Нажимаем 'отправить' в форме подписки",
                        EduBlockPage.contactsSubscribeButton)
                .validateCaptchaAppearance("Так как в проде сабмит защищен капчой, ограничиваемся проверкой её появления",
                        EduBlockPage.captchaForm);
    }

}
