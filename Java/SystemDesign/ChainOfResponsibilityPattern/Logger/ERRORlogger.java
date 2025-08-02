package SystemDesign.ChainOfResponsibilityPattern.Logger;

public class ERRORlogger extends DEBUGlogger {
    
    ERRORlogger(LoggerProcessor ERRORloggerProcessor){
        super(ERRORloggerProcessor);
    }

    public void log(int ERROR,String message){
        if(ERROR==3){
            System.out.println("ERROR:"+message);
        }else{
            super.log(ERROR,message);
        }
    }
}
