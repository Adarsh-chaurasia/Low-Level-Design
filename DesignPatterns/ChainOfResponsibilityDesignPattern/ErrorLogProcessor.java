package DesignPatterns.ChainOfResponsibilityDesignPattern;

public class ErrorLogProcessor extends LogProcessor{


    ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(String Message, int logLevel) {

        if(logLevel == ERROR){
            System.out.println("ERROR : " + Message);
        }
        else
            super.log(Message, logLevel);
    }
}
