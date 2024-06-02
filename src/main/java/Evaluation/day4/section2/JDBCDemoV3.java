package Evaluation.day4.section2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDemoV3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\SDAIA-Course-EV\\src\\main\\java\\Evaluation\\day4\\hr.db";
        String query = "delete from jobs where job_Id = ?";

        try(Connection connection = DriverManager.getConnection(url);) {

            PreparedStatement st = connection.prepareStatement(query);
            System.out.println("Enter Job ID: ");
            int jobId = sc.nextInt();
            st.setInt(1,jobId);
            sc.nextLine();

            int rows = st.executeUpdate();

            System.out.println(rows + " delete");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
