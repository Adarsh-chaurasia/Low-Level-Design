package DesignPatterns.ProxyDesignPattern;

public class EmployeeDaoImplementation implements EmployeeDao{
    @Override
    public void createUser() throws Exception {
        System.out.println("User Created");

    }

    @Override
    public String getUser() throws Exception {

        return "User";
    }

    @Override
    public void deleteUser() throws Exception {
        System.out.println("User Deleted");

    }
}
