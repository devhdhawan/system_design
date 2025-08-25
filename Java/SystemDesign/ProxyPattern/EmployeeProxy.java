package SystemDesign.ProxyPattern;

public class EmployeeProxy implements Employee {
    private EmployeeImpl emObj;

    EmployeeProxy(){
        emObj = new EmployeeImpl();
    }

    public void create(String user,int employeeId){
        if(user=="ADMIN"){
            emObj.create(user, employeeId);
        }else{
            System.out.println("Access Denied for create Record");
        }
    }

    public void delete(String user,int employeeId){
        if(user=="ADMIN"){
            emObj.delete(user, employeeId);
        }else{
            System.out.println("Access Denied for delete Record");
        }
    }

    public void get(String user,int employeeId){
        if(user=="ADMIN" || user=="USER"){
            emObj.get(user, employeeId);
        }else{
            System.out.println("Access Denied for get Record");
        }
    }
}
