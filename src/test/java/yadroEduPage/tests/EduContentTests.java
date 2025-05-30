package yadroEduPage.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import yadroEduPage.compontnts.EduBlockPage;

public class EduContentTests extends TestBase {

    EduBlockPage eduPage = new EduBlockPage();

    @BeforeEach
    public void beforeEach() {
        eduPage.openPage();
    }

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

    @Test
    public void eduPromoVisibleTest() {
        eduPage.elementVisible("Блок промо должен быть видимым",
                EduBlockPage.promoBlock);
        eduPage.elementByTextVisible("Отображение заголовка промо блока", "YADRO ИМПУЛЬС",
                        EduBlockPage.promoSubscription)
                .elementByTextVisible("Отображение подзаголовка промо блока", "Летняя стажировка",
                        EduBlockPage.promoSubscription);
    }

    @Test
    public void eduSubscriptionVisibleTest() {
        eduPage.elementVisible("Блок подписки должен быть видимым",
                EduBlockPage.promoSubscribeBlock);
        eduPage.elementByTextVisible("Отображение заголовка блока подписки", "Ждем тебя в следующем сезоне!",
                EduBlockPage.promoSubscribeHeader);
        eduPage.elementVisible("Блок подписки должен быть видимым",
                EduBlockPage.promoSubscribeForm);
    }

    @Test
    public void eduBannerVisibleTest() {
        eduPage.elementVisible("Блок баннера должен быть видимым",
                        EduBlockPage.bannerBlock)
                .elementVisible("Сам баннер должен быть видимым",
                        EduBlockPage.bannerImage);
    }

    @Test
    public void eduHowWasVisibleTest() {
        eduPage.elementVisible("Блок 'Как проходит Импульс' должен быть видимым",
                        EduBlockPage.howWasBlock)
                .elementVisible("Блок с видео должен быть видимым",
                        EduBlockPage.mediatorIFrame)
                .elementVisible("Блок c с информаций должен быть видимым",
                        EduBlockPage.howWasInfo);
    }

    @Test
    public void eduDirectionsVisibleTest() {
        eduPage.elementVisible("Блок 'Направления' должен быть видимым",
                        EduBlockPage.directionsBlock)
                .elementVisible("Фильтры должен быть видимымы",
                        EduBlockPage.directionsFilters)
                .elementVisible("Карточки должен быть видимым",
                        EduBlockPage.directionsCards);
    }

    @Test
    public void eduConditionsVisibleTest() {
        eduPage.elementVisible("Условия стражировки должен быть видимым",
                        EduBlockPage.conditionsBlock)
                .elementVisible("Карточка с условиями должен быть видима",
                        EduBlockPage.conditionsItem);
    }

    @Test
    public void eduPurposeVisibleTest() {
        eduPage.elementVisible("Блок с приглашением должен быть видимым",
                        EduBlockPage.purposeBlock)
                .elementVisible("Содержимое блока должно быть видимо",
                        EduBlockPage.purposeContent);
    }

    @Test
    public void eduProcessingTest() {
        eduPage.elementVisible("Блок 'Как проходит стажировка' должен быть видимым",
                        EduBlockPage.processingBlock)
                .elementVisible("Содержимое блока должно быть видимо",
                        EduBlockPage.processingContent);
    }

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

    @Test
    public void eduTFAQVisibleTest() {
        eduPage.elementVisible("Блок 'FAQ' должен быть видимым",
                        EduBlockPage.faqBlock)
                .elementVisible("Содержимое блока должно быть видимо",
                        EduBlockPage.faqContent);
    }

    @Test
    public void eduContactsVisibleTest() {
        eduPage.elementVisible("Блок 'FAQ' должен быть видимым",
                        EduBlockPage.contactsBlock)
                .elementVisible("Содержимое блока должно быть видимо",
                        EduBlockPage.contactsLink)
                .elementVisible("Содержимое блока должно быть видимо",
                        EduBlockPage.contactsSubscribeForm);
    }

    @Test
    public void eduFooterVisibleTest() {
        eduPage.elementVisible("Футер должен быть видимым",
                EduBlockPage.footerBlock);
    }


}
