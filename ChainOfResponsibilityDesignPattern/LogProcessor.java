package ChainOfResponsibilityDesignPattern;

public abstract class LogProcessor {

    public  static  int INFO = 1;

    public  static  int DEBUG = 2;

    public  static  int ERROR = 3;

    LogProcessor nextLogProcessor;

    LogProcessor(LogProcessor logProcessor){
        this.nextLogProcessor = logProcessor;
    }

    public void log(String Message , int logLevel){
        if(nextLogProcessor != null){
            nextLogProcessor.log(Message, logLevel );
        }
    }

}
