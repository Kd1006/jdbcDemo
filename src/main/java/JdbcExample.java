import java.sql.*;


public class JdbcExample {
    //API
    //JDBC -- Java database Connectivity -Allows java to talk to database
    // The driver - download
    // SQL mySQL, postgres
    //link to database
    //usr pass
    public static void main(String[] args) throws SQLException {
        String dbURL = "jdbc:mysql://localhost:3306/demo_db";
        String username = "root";
        String password = "";
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
    try{
      conn = DriverManager.getConnection(dbURL, username, password);
        System.out.println("Connected to database successfully");
        statement = conn.createStatement();

        resultSet = statement.executeQuery("SELECT * FROM student");
        statement = conn.createStatement();
        statement.execute("INSERT INTO student VALUES (NULL, 'JACK', 44)");

        while(resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            System.out.println("ID: " +id + " Name: "+ name + " Age: " +age);
// SQL Injection //
            // we use prepared

        }




    }catch (SQLException e){
        System.out.println(e.getMessage());
        }
    }
    // Execute SQL statements

}
