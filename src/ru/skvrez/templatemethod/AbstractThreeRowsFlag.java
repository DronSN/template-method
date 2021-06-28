package ru.skvrez.templatemethod;

public abstract class AbstractThreeRowsFlag {

    public final void drawThreeRowsFlag() {
        drawUpperLevel();
        drawMiddleLevel();
        drawBottomLevel();
        if (hasFlagPole()) {
            drawFlagPole();
        }
    }

    protected abstract void drawUpperLevel();

    protected abstract void drawMiddleLevel();

    protected abstract void drawBottomLevel();

    public final void drawFlagPole() {
        System.out.println("Draw flagpole");
    }

    protected boolean hasFlagPole() {
        return true;
    }

}
