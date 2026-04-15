package BuilderDP;

public class Main {

    public static  void main(String[] args){

        Employee emp = new Employee.EmployeeBuilder("Adarsh","TCS").setHasBike(true).build();

        System.out.println(emp);

    }
}
