package Evaluation.day4.section2;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertJobs {
    private int jobID;
    private String jobnTitle;
    private double minSalary;
    private double mxnSalary;

    public InsertJobs() {
    }

    public InsertJobs(ResultSet rs) throws SQLException {
        jobID = rs.getInt("job_Id");
        jobnTitle = rs.getString("job_title");
        minSalary = rs.getInt("min_Salary");
        mxnSalary = rs.getInt("mxn_Salary");

    }

    public InsertJobs(int jobID, String jobnTitle, double minSalary, double mxnSalary) {
        this.jobID = jobID;
        this.jobnTitle = jobnTitle;
        this.minSalary = minSalary;
        this.mxnSalary = mxnSalary;
    }

    public int getJobID() {
        return jobID;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    public String getJobnTitle() {
        return jobnTitle;
    }

    public void setJobnTitle(String jobnTitle) {
        this.jobnTitle = jobnTitle;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMxnSalary() {
        return mxnSalary;
    }

    public void setMxnSalary(double mxnSalary) {
        this.mxnSalary = mxnSalary;
    }

    @Override
    public String toString() {
        return "Jobs{" +
                "jobID=" + jobID +
                ", jobnTitle='" + jobnTitle + '\'' +
                ", minSalary=" + minSalary +
                ", mxnSalary=" + mxnSalary +
                '}';
    }
}
