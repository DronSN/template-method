package ru.skvrez.templatemethod;

public class Main {

    public static void main(String[] args) {
        System.out.println("Russian flag");
        AbstractThreeRowsFlag russianFlag = new RussianFlag();
        russianFlag.drawThreeRowsFlag();
        System.out.println("Netherlands flag");
        AbstractThreeRowsFlag netherlandsFlag = new NetherlandsFlag();
        netherlandsFlag.drawThreeRowsFlag();
    }
}
