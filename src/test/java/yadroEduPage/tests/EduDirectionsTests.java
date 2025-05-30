package yadroEduPage.tests;

import com.codeborne.selenide.selector.ByText;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import yadroEduPage.compontnts.EduBlockPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class EduDirectionsTests extends TestBase {

    EduBlockPage eduPage = new EduBlockPage();

    @BeforeEach
    public void beforeEach() {
        eduPage.openPage();
    }


    @Feature("Проверка блока с карточками вакансий")
    @DisplayName("Проверка открытия карточки")
    @Owner("Toss Antilles")
    @Test
    public void directionsOpenCardOperationsTest() {
        eduPage.elementClick("Открыть карточку направления Python",
                EduBlockPage.directionsCardPreview.find(new ByText("Python")));

        $(".Tbd").shouldBe(visible);
        $(".Tbd").$(".Description").shouldHave(text("Python"));
        $(".Tbd").$(".Description").shouldBe(visible);
        $(".Tbd").$(".Materials").shouldBe(visible);
    }

    @Feature("Проверка блока с карточками вакансий")
    @DisplayName("Проверка закрытия карточки")
    @Owner("Toss Antilles")
    @Test
    public void directionsCloseCardOperationsTest() {
        eduPage.elementClick("Открыть карточку направления Python",
                EduBlockPage.directionsCardPreview.find(new ByText("Python")));
        eduPage.elementClick("Закрыть карточку направления Python",
                EduBlockPage.directionsCardPreview.find(new ByText("Python")));

        $(".Tbd").shouldBe(hidden);
    }

    @Feature("Проверка блока с карточками вакансий")
    @DisplayName("Проверка фильтров")
    @Owner("Toss Antilles")
    @Test
    public void directionsFiltersTest() {

        eduPage.elementClick("Включить фильтр направления Тестирование",
                $(".Directions__wrapper").find(new ByText("Направления")).parent()
                        .find(new ByText("Тестирование")));
        $(".Cards").$(".Cards__card").shouldHave(text("Ручное тестирование"));
        $(".Cards").$(".Cards__card").shouldNotHave(text("Python"));

        eduPage.elementClick("Включить фильтр локации Минск",
                $(".Directions__wrapper").find(new ByText("Города")).parent()
                        .find(new ByText("Минск")));
        $(".Cards").$(".Cards__card").shouldHave(text("Минск"));
        $(".Cards").$(".Cards__card").shouldNotHave(text("Малаховка"));

        eduPage.elementClick("Включить фильтр локации Малаховка",
                $(".Directions__wrapper").find(new ByText("Города")).parent()
                        .find(new ByText("Малаховка")));
        $(".Cards").shouldBe(hidden);
    }

}
