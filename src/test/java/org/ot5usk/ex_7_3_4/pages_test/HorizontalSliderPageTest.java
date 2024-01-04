package org.ot5usk.ex_7_3_4.pages_test;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ot5usk.ex_7_3_4.BaseTest;
import org.ot5usk.ex_7_3_4.steps.assertions.steps_assertions.HorizontalSliderPageStepsAssertions;
import org.ot5usk.ex_7_3_4.steps.pages_steps.pages_links_steps.HorizontalSliderPageSteps;

public class HorizontalSliderPageTest extends BaseTest {

    @DisplayName("Значение слайдера")
    @Description("Значение слайдера равно нулю")
    @Test
    void testHorizontalSliderValue() {
        HorizontalSliderPageSteps pageSteps = homePageSteps.goToHorizontalSliderPageSteps();
        HorizontalSliderPageStepsAssertions pageStepsAssertions = new HorizontalSliderPageStepsAssertions(pageSteps);
        pageStepsAssertions.checkSliderValue();
    }
}