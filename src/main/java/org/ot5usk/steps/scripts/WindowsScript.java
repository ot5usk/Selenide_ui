package org.ot5usk.steps.scripts;

import org.ot5usk.steps.pages_steps.windows_steps.NewWindowPageSteps;
import org.ot5usk.steps.pages_steps.windows_steps.WindowsPageSteps;

import java.util.List;

import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.Selenide.webdriver;
import static org.ot5usk.steps.assertions.WindowsAsserts.*;

public class WindowsScript {

    private final WindowsPageSteps windowsPageSteps = new WindowsPageSteps();
    private String defaultHandle;

    public void execute() {
        windowsPageSteps.openPage();
        defaultHandle = webdriver().driver().getWebDriver().getWindowHandle();
        NewWindowPageSteps newWindowPageSteps = windowsPageSteps.clickNewWindowPageLink();
        checkToNewWindowTransition();
        switchToNewOpenedWindow();
        expectedPageUrl(newWindowPageSteps.url());
        checkPageText(newWindowPageSteps.getExampleText());
        newWindowPageSteps.closePage();
        checkToBackTransition();
        switchToPreviousWindow();
        expectedPageUrl(windowsPageSteps.url());
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
