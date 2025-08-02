import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*TvSet tvSetForMember1 = TvSet.getTvSetInstance();

        TvSet tvSetForMember2 = TvSet.getTvSetInstance();

        System.out.println(tvSetForMember1);
        System.out.println(tvSetForMember2);
*/
        // both will print the same address space i.e same object.
        // constructor will be only called once


        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(() -> TvSet.getTvSetInstance());
        executor.execute(() -> TvSet.getTvSetInstance());
        executor.execute(() -> TvSet.getTvSetInstance());
    }
}