import java.sql.*;public class view {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "manager");
            String sql = "SELECT * FROM stu";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int regno = rs.getInt("regno");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");
                System.out.println(
                        "RegNo: " + regno + " | Name: " + name + " | Marks: " + marks);}
            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}