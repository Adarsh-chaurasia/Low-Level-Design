package DesignPatterns.ChainOfResponsibilityDesignPattern;

public class InfoLogProcessor extends LogProcessor{


    InfoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(String Message, int logLevel) {

        if(logLevel == INFO){
            System.out.println("INFO : " + Message);
        }
        else
            super.log(Message, logLevel);
    }
}
