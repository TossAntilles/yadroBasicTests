package yadroEduPage.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import yadroEduPage.compontnts.EduBlockPage;

public class EduContentTests extends TestBase {

    EduBlockPage eduPage = new EduBlockPage();

    @BeforeEach
    public void beforeEach() {
        eduPage.openPage();
    }

    @Feature("Проверка наличия блоков на странице")
    @DisplayName("Проверка наличия меню")
    @Owner("Toss Antilles")
    @Test
    public void eduHeaderVisibleTest() {
        eduPage.elementVisible("Хэдер страницы должен быть видимым",
                EduBlockPage.headerBlock);
        eduPage.elementByTextVisible("Отображение пункта меню 'Направления'",
                        "Направления", EduBlockPage.headerMenu)
                .elementByTextVisible("Отображение пункта меню 'Условия'",
                        "Условия", EduBlockPage.headerMenu)
                .elementByTextVisible("Отображение пункта меню 'Для кого'",
                        "Для кого", EduBlockPage.headerMenu)
                .elementByTextVisible("Отображение пункта меню 'Как проходит'",
                        "Как проходит", EduBlockPage.headerMenu)
                .elementByTextVisible("Отображение пункта меню 'FAQ'",
                        "FAQ", EduBlockPage.headerMenu);
    }

    @Feature("Проверка наличия блоков на странице")
    @DisplayName("Проверка наличия блока промо")
    @Owner("Toss Antilles")
    @Test
    public void eduPromoVisibleTest() {
        eduPage.elementVisible("Блок промо должен быть видимым",
                EduBlockPage.promoBlock);
        eduPage.elementByTextVisible("Отображение заголовка промо блока", "YADRO ИМПУЛЬС",
                        EduBlockPage.promoSubscription)
                .elementByTextVisible("Отображение подзаголовка промо блока", "Летняя стажировка",
                        EduBlockPage.promoSubscription);
    }

    @Feature("Проверка наличия блоков на странице")
    @DisplayName("Проверка наличия блока подписки")
    @Owner("Toss Antilles")
    @Test
    public void eduSubscriptionVisibleTest() {
        eduPage.elementVisible("Блок подписки должен быть видимым",
                EduBlockPage.promoSubscribeBlock);
        eduPage.elementByTextVisible("Отображение заголовка блока подписки", "Ждем тебя в следующем сезоне!",
                EduBlockPage.promoSubscribeHeader);
        eduPage.elementVisible("Блок подписки должен быть видимым",
                EduBlockPage.promoSubscribeForm);
    }

    @Feature("Проверка наличия блоков на странице")
    @DisplayName("Проверка наличия блока баннера")
    @Owner("Toss Antilles")
    @Test
    public void eduBannerVisibleTest() {
        eduPage.elementVisible("Блок баннера должен быть видимым",
                        EduBlockPage.bannerBlock)
                .elementVisible("Сам баннер должен быть видимым",
                        EduBlockPage.bannerImage);
    }

    @Feature("Проверка наличия блоков на странице")
    @DisplayName("Проверка наличия блока импульса")
    @Owner("Toss Antilles")
    @Test
    public void eduHowWasVisibleTest() {
        eduPage.elementVisible("Блок 'Как проходит Импульс' должен быть видимым",
                        EduBlockPage.howWasBlock)
                .elementVisible("Блок с видео должен быть видимым",
                        EduBlockPage.mediatorIFrame)
                .elementVisible("Блок c с информаций должен быть видимым",
                        EduBlockPage.howWasInfo);
    }


    @Feature("Проверка наличия блоков на странице")
    @DisplayName("Проверка наличия блока направлений")
    @Owner("Toss Antilles")
    @Test
    public void eduDirectionsVisibleTest() {
        eduPage.elementVisible("Блок 'Направления' должен быть видимым",
                        EduBlockPage.directionsBlock)
                .elementVisible("Фильтры должен быть видимымы",
                        EduBlockPage.directionsFilters)
                .elementVisible("Карточки должен быть видимым",
                        EduBlockPage.directionsCards);
    }


    @Feature("Проверка наличия блоков на странице")
    @DisplayName("Проверка наличия блока стажировки")
    @Owner("Toss Antilles")
    @Test
    public void eduConditionsVisibleTest() {
        eduPage.elementVisible("Условия стражировки должен быть видимым",
                        EduBlockPage.conditionsBlock)
                .elementVisible("Карточка с условиями должен быть видима",
                        EduBlockPage.conditionsItem);
    }


    @Feature("Проверка наличия блоков на странице")
    @DisplayName("Проверка наличия блока с приглашением")
    @Owner("Toss Antilles")
    @Test
    public void eduPurposeVisibleTest() {
        eduPage.elementVisible("Блок с приглашением должен быть видимым",
                        EduBlockPage.purposeBlock)
                .elementVisible("Содержимое блока должно быть видимо",
                        EduBlockPage.purposeContent);
    }

    @Feature("Проверка наличия блоков на странице")
    @DisplayName("Проверка наличия блока 'Как проходит стажировка'")
    @Owner("Toss Antilles")
    @Test
    public void eduProcessingTest() {
        eduPage.elementVisible("Блок 'Как проходит стажировка' должен быть видимым",
                        EduBlockPage.processingBlock)
                .elementVisible("Содержимое блока должно быть видимо",
                        EduBlockPage.processingContent);
    }

    @Feature("Проверка наличия блоков на странице")
    @DisplayName("Проверка наличия блока 'Мы ищем таланты'")
    @Owner("Toss Antilles")
    @Test
    public void eduTalentsVisibleTest() {
        eduPage.elementVisible("Блок 'Мы ищем таланты' должен быть видимым",
                        EduBlockPage.talentsBlock)
                .elementVisible("Картинка в блоке должна быть видима",
                        EduBlockPage.talentsPicture)
                .elementVisible("Кнопка 'Хочу в команду' в блоке должна быть видима",
                        EduBlockPage.talentsLink);
        eduPage.elementByTextVisible("Заголовок блока должно быть 'Мы ищем таланты'",
                "Мы ищем таланты", EduBlockPage.talentsHeader);

    }

    @Feature("Проверка наличия блоков на странице")
    @DisplayName("Проверка наличия блока FAQ")
    @Owner("Toss Antilles")
    @Test
    public void eduTFAQVisibleTest() {
        eduPage.elementVisible("Блок 'FAQ' должен быть видимым",
                        EduBlockPage.faqBlock)
                .elementVisible("Содержимое блока должно быть видимо",
                        EduBlockPage.faqContent);
    }

    @Feature("Проверка наличия блоков на странице")
    @DisplayName("Проверка наличия блока контактов")
    @Owner("Toss Antilles")
    @Test
    public void eduContactsVisibleTest() {
        eduPage.elementVisible("Блок контактов должен быть видимым",
                        EduBlockPage.contactsBlock)
                .elementVisible("Содержимое блока должно быть видимо",
                        EduBlockPage.contactsLink)
                .elementVisible("Содержимое блока должно быть видимо",
                        EduBlockPage.contactsSubscribeForm);
    }

    @Feature("Проверка наличия блоков на странице")
    @DisplayName("Проверка наличия футера")
    @Owner("Toss Antilles")
    @Test
    public void eduFooterVisibleTest() {
        eduPage.elementVisible("Футер должен быть видимым",
                EduBlockPage.footerBlock);
    }


}
