package SystemDesign.ChainOfResponsibilityPattern.Logger;



public class DEBUGlogger extends LoggerProcessor {
    
    DEBUGlogger(LoggerProcessor DEBUGloggerProcessor){
        super(DEBUGloggerProcessor);
    }

    public void log(int debug,String message){
        if(debug==2){
            System.out.println("DEBUG:"+message);
        }else{
            super.log(debug,message);
        }
    }
}
