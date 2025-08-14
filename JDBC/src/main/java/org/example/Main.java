package org.example;
import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter admin id: ");
        int id=sc.nextInt();
        final String url = "jdbc:mariadb://localhost:3306/jdbc?user=root&password=root";
        Connection c = DriverManager.getConnection(url);

        String query = "SELECT name, email FROM admin WHERE admin_id = ?";
        PreparedStatement prepare_statement = c.prepareStatement(query);
        prepare_statement.setInt(1, id);

        ResultSet rs = prepare_statement.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("name") + " " + rs.getString("email"));
        }

        System.out.print("do you want to shutdown? ");
String exit=sc.nextLine();
        if(exist.equal('yes')){
            String shutdownQuery = "delete from admin  ";
            Statement st = c.createStatement();
            st.executeUpdate(shutdownQuery);
            System.exit(0);

        }
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


    }
}