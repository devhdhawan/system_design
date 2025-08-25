package SystemDesign.ProxyPattern;

public interface Employee {

    public void create(String user,int employeeId);
    public void delete(String user,int employeeId);
    public void get(String user,int employeeId);


}
