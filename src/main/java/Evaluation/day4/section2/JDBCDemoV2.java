package Evaluation.day4.section2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDemoV2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\SDAIA-Course-EV\\src\\main\\java\\Evaluation\\day4\\hr.db";
        String query = "insert into jobs values(?, ?, ?, ?)";

        try(Connection connection = DriverManager.getConnection(url);) {

            PreparedStatement st = connection.prepareStatement(query);
            System.out.println("Enter Job ID: ");
            int jobId = sc.nextInt();
            st.setInt(1,jobId);
            sc.nextLine();

            System.out.println("Enter Job Title: ");
            String jobTitle = sc.nextLine();
            st.setString(2,jobTitle);

            System.out.println("Enter Min Salary: ");
            int minSalary = sc.nextInt();
            st.setInt(3,minSalary);

            System.out.println("Enter Mxn Salary: ");
            int mxnSalary = sc.nextInt();
            st.setInt(4,mxnSalary);

            int rows = st.executeUpdate();

            System.out.println(rows + " inserted");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
