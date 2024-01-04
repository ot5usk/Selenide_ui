package org.ot5usk.ex_7_3_4.pages_test;

import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ot5usk.ex_7_3_4.BaseTest;
import org.ot5usk.ex_7_3_4.steps.assertions.steps_assertions.StatusCodesPageStepsAssertions;
import org.ot5usk.ex_7_3_4.steps.pages_steps.pages_links_steps.StatusCodesPageSteps;

public class StatusCodesPageTest extends BaseTest {

    private static StatusCodesPageStepsAssertions pageStepsAssertions;

    @BeforeAll
    static void init() {
        StatusCodesPageSteps pageSteps = homePageSteps.goToStatusCodesPageSteps();
        pageStepsAssertions = new StatusCodesPageStepsAssertions(pageSteps);
    }

    @DisplayName("Текст ссылки на страницу статус-код 200")
    @Description("Текст ссылки: '200'")
    @Test
    void testLinkTextToCode200Page() {
        pageStepsAssertions.checkLinkTextToCode200Page();
    }

    @DisplayName("Атрибут href ссылки на страницу статус-код 200")
    @Description("href ссылки: 'https://the-internet.herokuapp.com/status_codes/200'")
    @Test
    void testLinkHrefToCode200Page() {
        pageStepsAssertions.checkLinkHrefToCode200Page();
    }
}