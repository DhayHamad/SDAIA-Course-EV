package Evaluation.day4.section2;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertJobs {
    private int jobID;
    private String jobnTitle;
    private int minSalary;
    private int mxnSalary;


    public InsertJobs(ResultSet rs) throws SQLException {
        jobID = rs.getInt("job_Id");
        jobnTitle = rs.getString("job_title");
        minSalary = rs.getInt("min_Salary");
        mxnSalary = rs.getInt("mxn_Salary");

    }

    public InsertJobs(int jobID, String jobnTitle, int minSalary, int mxnSalary) {
        this.jobID = jobID;
        this.jobnTitle = jobnTitle;
        this.minSalary = minSalary;
        this.mxnSalary = minSalary;
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

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMxnSalary() {
        return mxnSalary;
    }

    public void setMxnSalary(int mxnSalary) {
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
