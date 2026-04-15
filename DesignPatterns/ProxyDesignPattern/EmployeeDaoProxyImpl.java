package ProxyDesignPattern;

public class EmployeeDaoProxyImpl {

    EmployeeDaoImplementation employee = new EmployeeDaoImplementation();
    public void createUser(String Client) throws Exception {

        if(Client.equalsIgnoreCase("ADMIN"))
           employee.createUser();
        else
            System.out.println("Access Denied");
    }

    public String getUser(String Client) throws Exception {
        if(Client.equalsIgnoreCase("ADMIN") || Client.equalsIgnoreCase("USER"))

             return employee.getUser();
        else{
            System.out.println("Access Denied");
        }
    return null;
    }

    public void deleteUser(String Client) throws Exception {

        if(Client.equalsIgnoreCase("ADMIN"))
            System.out.println("User Deleted");
        else
            System.out.println("Access Denied");

    }
}
