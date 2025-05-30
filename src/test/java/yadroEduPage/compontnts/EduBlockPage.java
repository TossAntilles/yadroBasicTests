package yadroEduPage.compontnts;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class EduBlockPage {

    public static SelenideElement cookies = $(".Cookies__button"),
        headerBlock = $(".Impulse__header"),
        headerMenu = $(".Header__nav"),
        promoBlock = $("#promo"),
        promoSubscription = $(".Promo__content-info"),
        promoSubscribeBlock = $(".SubscribeForm"),
        promoSubscribeHeader = $(".Form--impulse").$(".Form__title"),
        promoSubscribeForm = $(".Form--impulse").$(".Form__input"),
        promoConfirmationCheckbox = $(".Form--impulse").$(".Form__checkmark"),
        promoSubscribeButton = $(".Form--impulse").$(".Button--impulse"),
        bannerBlock = $(".Banner"),
        bannerImage = $(".Banner__img"),
        howWasBlock = $(".HowWasIt"),
        mediatorIFrame = $("#mediator-iframe"),
        howWasInfo = $(".HowWasIt__information"),
        directionsBlock = $(".Directions"),
        directionsFilters = $(".Directions__filters"),
        directionsCards = $(".Cards"),

        directionsCardPreview = $(".Cards").$(".Cards__card"),


        conditionsBlock = $("#conditions"),
        conditionsItem = $(".Conditions-list__item"),
        purposeBlock = $("#purpose"),
        purposeContent = $(".purpose__wrapper"),
        processingBlock = $("#processing"),
        processingContent = $(".Processing__Steps-wrapper"),
        talentsBlock = $(".Talents"),
        talentsPicture = $(".Talents__img"),
        talentsHeader = $(".Talents__heading"),
        talentsLink = $(".purpose__wrapper"),
        faqBlock = $(".Faq"),
        faqContent = $(".Faq__item"),
        contactsBlock = $(".Contacts"),
        contactsLink = $(".Link--write-us"),
        contactsSubscribeForm = $(".Contacts__form").$(".Form__input"),
        contactsConfirmationCheckbox = $(".Contacts__form").$(".Form__checkmark"),
        contactsSubscribeButton = $(".Contacts__form").$(".Button--subscribe"),
        footerBlock = $(".Footer"),
        captchaForm =  $(".SmartCaptcha-Overlay_visible");


    public EduBlockPage openPage() {
        step("Открываем страницу Yadro Импульс", () -> {
            open("/impulse/");
        });
        return this;
    }

    public EduBlockPage elementVisible(String description, SelenideElement element){
        step(description, ()-> {
            element.shouldBe(visible);
        });
        return this;
    }

    public EduBlockPage elementByTextVisible(String description, String text, SelenideElement element){
        step(description, ()-> {
            element.shouldHave(text(text));
        });
        return this;
    }

    public EduBlockPage formInput(String description, SelenideElement email, String input) {
        step(description, () -> {
            email.setValue(input);
        });
        return this;
    }

    public EduBlockPage checkboxClick(SelenideElement checkbox){
        checkbox.click();
        return this;
    }

    public EduBlockPage elementClick(String description, SelenideElement button){
        step(description, () -> {
            button.click();
        });
        return this;
    }


    public EduBlockPage validateCaptchaAppearance(String description, SelenideElement captchaForm) {
        step(description, () -> {
            captchaForm.shouldBe(visible);
        });
        return this;
    }

    public EduBlockPage closeCookiesBanner(SelenideElement cookies) {
        cookies.click();
        return this;
    }
}
