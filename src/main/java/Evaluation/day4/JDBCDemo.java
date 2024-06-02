package Evaluation.day4;

import java.sql.*;

public class JDBCDemo {

    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\SDAIA-Course-EV\\src\\main\\java\\Evaluation\\day4\\hr.db";
        String query = "select * from jobs";

        try(Connection connection = DriverManager.getConnection(url);) {

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()){
                Jobs j = new Jobs(rs);
                System.out.println(j);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
