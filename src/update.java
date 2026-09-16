import java.sql.*;
public class update {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db", "root", "manager");
            String sql = "UPDATE stu SET marks=? WHERE regno=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 92);
            ps.setInt(2, 102);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Data updated");
            } else {
                System.out.println("No record found");
            }
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}