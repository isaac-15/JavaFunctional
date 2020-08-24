package functionalinterface;
import java.util.function.*;
public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getDBConnectionURL());

        System.out.println(getDBCConnectionURLSupplier.get());
    }

    static String getDBConnectionURL(){
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDBCConnectionURLSupplier =
            () -> "jdbc://localhost:5432/users";
}
