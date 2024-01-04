package org.ot5usk.ex_7_4_3.steps.scripts;

import org.ot5usk.ex_7_4_3.steps.assertions.WindowsAsserts;
import org.ot5usk.ex_7_4_3.steps.pages_steps.windows_steps.NewWindowPageSteps;
import org.ot5usk.ex_7_4_3.steps.pages_steps.windows_steps.WindowsPageSteps;

import java.util.List;

import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.Selenide.webdriver;

public class WindowsScript {

    private final WindowsPageSteps windowsPageSteps = new WindowsPageSteps();
    private String defaultHandle;

    public void execute() {
        windowsPageSteps.openPage();
        defaultHandle = webdriver().driver().getWebDriver().getWindowHandle();
        NewWindowPageSteps newWindowPageSteps = windowsPageSteps.clickNewWindowPageLink();
        WindowsAsserts.checkToNewWindowTransition();
        switchToNewOpenedWindow();
        WindowsAsserts.expectedPageUrl(newWindowPageSteps.url());
        WindowsAsserts.checkPageText(newWindowPageSteps.getExampleText());
        newWindowPageSteps.closePage();
        WindowsAsserts.checkToBackTransition();
        switchToPreviousWindow();
        WindowsAsserts.expectedPageUrl(windowsPageSteps.url());
    }

    private void switchToNewOpenedWindow() {
        List<String> actualHandles = webdriver().driver().getWebDriver().getWindowHandles().stream().toList();
        for (String handle : actualHandles) {
            if (!handle.equals(defaultHandle)) {
                switchTo().window(handle);
            }
        }
    }

    private void switchToPreviousWindow() {
        switchTo().window(defaultHandle);
    }
}
