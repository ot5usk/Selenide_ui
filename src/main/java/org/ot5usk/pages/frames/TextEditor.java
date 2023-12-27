package org.ot5usk.pages.frames;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;

public class TextEditor {

    private final SelenideElement FRAME = $x("//iframe[@id='mce_0_ifr']");
    private final SelenideElement FRAME_BODY_INPUT = $x("//body[@id='tinymce']");
    private final SelenideElement BOLD_BTN = $x("//button[@aria-label='Bold']");

    public void enterText(String text) {
        switchTo().frame(FRAME);
        FRAME_BODY_INPUT.clear();
        FRAME_BODY_INPUT.sendKeys(text);
    }

    public void makeTextBold() {
        FRAME_BODY_INPUT.sendKeys(Keys.CONTROL + "a");
        switchTo().defaultContent();
        BOLD_BTN.click();
    }
}
