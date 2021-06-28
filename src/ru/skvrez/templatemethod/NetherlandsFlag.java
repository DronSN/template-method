package ru.skvrez.templatemethod;

public class NetherlandsFlag extends AbstractThreeRowsFlag {
    @Override
    protected void drawUpperLevel() {
        System.out.println("Draw red line");
    }

    @Override
    protected void drawMiddleLevel() {
        System.out.println("Draw white line");
    }

    @Override
    protected void drawBottomLevel() {
        System.out.println("Draw blue line");
    }
}
