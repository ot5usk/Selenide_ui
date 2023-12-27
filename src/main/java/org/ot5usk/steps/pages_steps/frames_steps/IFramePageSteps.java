package org.ot5usk.steps.pages_steps.frames_steps;

import io.qameta.allure.Step;
import org.ot5usk.pages.frames.IFramePage;

public class IFramePageSteps {

    private final IFramePage iFramePage;

    public IFramePageSteps(IFramePage iFramePage) {
        this.iFramePage = iFramePage;
    }

    @Step("Ввод текста в текстовый редактор")
    public IFramePageSteps enterTextIntoTextEditor(String text) {
        iFramePage.enterTextIntoTextEditor(text);
        return this;
    }

    @Step("Выделение текста жирным шрифтом")
    public void makeTextBoldInTextEditor() {
        iFramePage.makeTextBoldInTextEditor();
    }
}
