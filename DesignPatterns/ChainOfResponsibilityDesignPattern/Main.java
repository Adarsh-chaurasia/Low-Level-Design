package DesignPatterns.ChainOfResponsibilityDesignPattern;

public class Main {

    public static void main(String[] args) {

        LogProcessor log = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        log.log("Information", LogProcessor.INFO);

        log.log("NeedToDebug", LogProcessor.DEBUG);

        log.log("Error Occured", LogProcessor.ERROR);


    }
}
