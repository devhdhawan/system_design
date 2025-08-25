package SystemDesign.ProxyPattern;

public class EmployeeImpl implements Employee{
    public void create(String user,int employeeId){
        System.out.println("Create Employee Record");
    }

    public void delete(String user,int employeeId){
        System.out.println("Delete Employee Record");
    }

    public void get(String user,int employeeId){
        System.out.println("Get Employee Record");
    }
}
