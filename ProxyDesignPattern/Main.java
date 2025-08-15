package ProxyDesignPattern;

public class Main {

    public static void main(String[] args) throws Exception {

        String user = "ADMIN";

        EmployeeDaoProxyImpl employeeDaoProxy = new EmployeeDaoProxyImpl();

        employeeDaoProxy.createUser(user);
        System.out.println(employeeDaoProxy.getUser(user));
        employeeDaoProxy.deleteUser(user);


    }
}
