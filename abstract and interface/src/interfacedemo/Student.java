package interfacedemo;

public class Student {
    private int ssn;
    private String fname;
    private String lname;

    public Student(int ssn, String fname, String lname) {
        this.ssn = ssn;
        this.fname = fname;
        this.lname = lname;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ssn=" + ssn +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}
