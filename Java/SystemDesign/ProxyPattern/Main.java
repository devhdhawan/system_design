package SystemDesign.ProxyPattern;

public class Main {

    public static void main(String[] args){
        EmployeeProxy obj = new EmployeeProxy();

        obj.create("USER",123);
        obj.delete("ADMIN",456);
        obj.get("USER",123);
    }
}
