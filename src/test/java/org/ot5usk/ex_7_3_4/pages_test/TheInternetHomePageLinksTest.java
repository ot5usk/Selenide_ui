package org.ot5usk.ex_7_3_4.pages_test;

import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ot5usk.ex_7_3_4.BaseTest;
import org.ot5usk.ex_7_3_4.steps.assertions.steps_assertions.TheInternetHomePageLinksStepsAssertions;

public class TheInternetHomePageLinksTest extends BaseTest {

    private static TheInternetHomePageLinksStepsAssertions linksStepsAssertions;

    @BeforeAll
    static void init() {
        linksStepsAssertions = new TheInternetHomePageLinksStepsAssertions(homePageSteps.linksSteps());
    }

    @DisplayName("Ссылка на страницу Add/Remove Elements")
    @Description("Ссылка присутствует")
    @Test
    void testAddRemoveElementsPageLink() {
        linksStepsAssertions.addRemoveElementsPageLinkStepsIsVisible();
    }

    @DisplayName("Ссылка на страницу Horizontal Slider")
    @Description("Ссылка присутствует")
    @Test
    void testHorizontalSliderPageLink() {
        linksStepsAssertions.horizontalSliderPageLinkStepsIsVisible();
    }

    @DisplayName("Ссылка на страницу Status Codes")
    @Description("Ссылка присутствует")
    @Test
    void testStatusCodesPageLink() {
        linksStepsAssertions.statusCodesPageLinkStepsIsVisible();
    }
}
