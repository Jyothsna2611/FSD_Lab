import java.sql.Connection;
import java.sql.DriverManager;

public class jdbc {
    public static void main(String args[]) {
        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db", "root", "manager"
            );

            if (con != null) {
                System.out.println("DB connected");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}