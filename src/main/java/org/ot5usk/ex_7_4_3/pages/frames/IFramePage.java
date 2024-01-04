package org.ot5usk.ex_7_4_3.pages.frames;

public class IFramePage {

    private final TextEditor textEditor = new TextEditor();

    public void enterTextIntoTextEditor(String text) {
        textEditor.enterText(text);
    }

    public void makeTextBoldInTextEditor() {
        textEditor.makeTextBold();
    }
}
