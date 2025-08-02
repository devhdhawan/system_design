package SystemDesign.ChainOfResponsibilityPattern.Logger;



public class Main {
    public static void main(String[] args){
        LoggerProcessor logObj = new INFOlogger(new DEBUGlogger(new ERRORlogger(null)));

        logObj.log(LoggerProcessor.INFO,"INFO THIS LINE");
        logObj.log(LoggerProcessor.DEBUG,"DEBUG THIS LINE");
        logObj.log(LoggerProcessor.ERROR,"ERROR THIS LINE");

    }
}
