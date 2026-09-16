import java.sql.*;
public class delete {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "manager");
            String sql = "DELETE FROM stu WHERE regno=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 101);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Data deleted");
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