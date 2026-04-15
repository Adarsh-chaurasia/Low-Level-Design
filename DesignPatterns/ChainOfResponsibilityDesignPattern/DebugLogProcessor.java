package ChainOfResponsibilityDesignPattern;

public class DebugLogProcessor extends LogProcessor{


    DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(String Message, int logLevel) {

        if(logLevel == DEBUG){
            System.out.println("DEBUG : " + Message);
        }
        else
            super.log(Message, logLevel);
    }
}
