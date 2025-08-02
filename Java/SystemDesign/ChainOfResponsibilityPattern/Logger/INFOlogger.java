package SystemDesign.ChainOfResponsibilityPattern.Logger;

public class INFOlogger extends LoggerProcessor {
    
    INFOlogger(LoggerProcessor INFOLoggerProcessor){
        super(INFOLoggerProcessor);
    }

    
    public void log(int INFO,String message){
        if(INFO==1){
            System.out.println("INFO:"+message);
        }else{
            super.log(INFO,message);
        }
    }

}
