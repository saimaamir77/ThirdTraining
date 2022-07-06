import java.sql.*;

public class ThirdTraining {

    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "Saima1977";
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Connected");
                String sql = "select distinct last_name from sakila.actor limit 10";
                Statement statement = conn.createStatement();
                ResultSet result = statement.executeQuery(sql);
                int count = 0;

                while (result.next()) {
                    String name = result.getString(1);


                    String output = "User #%d: %s ";
                    System.out.println(String.format(output, ++count, name));
                }


            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }
}
