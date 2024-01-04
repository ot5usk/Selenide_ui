package org.ot5usk.ex_7_4_3.steps.scripts;

import org.ot5usk.ex_7_4_3.steps.pages_steps.frames_steps.FramesPageSteps;

public class FrameScript {

    private final FramesPageSteps framesPageSteps = new FramesPageSteps();

    public void execute() {
        framesPageSteps
                .openFramesPage()
                .goToIFramePage()
                .enterTextIntoTextEditor("Hello World")
                .makeTextBoldInTextEditor();
    }
}
