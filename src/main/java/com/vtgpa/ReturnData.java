/**
 * 
 */
package com.vtgpa;

/**
 * @author ryanbierly
 *
 */
public class ReturnData {
    private String department;
    private String courseNumber;
    private String instructor;
    private String instructorGPA;
    private String courseGPA;
    private String As;
    private String Bs;
    private String Cs;
    private String Ds;
    private String Fs;
    private String Ws;


    /**
     * 
     */
    public ReturnData() {
        department = "";
        courseNumber = "";
        instructor = "";
        instructorGPA = "0.0";
        courseGPA = "0.0";
        As = "";
        Bs = "";
        Cs = "";
        Ds = "";
        Fs = "";
        Ws = "";
    }


    /**
     * 
     * @return
     */
    public String getInstructor() {
        return instructor;
    }


    public void setInstructor(String name) {
        instructor = name;
    }


    /**
     * 
     * @return
     */
    public String getCourseNumber() {
        return courseNumber;
    }


    public void setNumber(String num) {
        courseNumber = num;
    }


    /**
     * 
     * @return
     */
    public String getDepartment() {
        return department;
    }


    public void setDepartment(String name) {
        department = name;
    }


    /**
     * @return the instructorGPA
     */
    public String getInstructorGPA() {
        return instructorGPA;
    }


    /**
     * @param instructorGPA
     *            the instructorGPA to set
     */
    public void setInstructorGPA(String instructorGPA) {
        this.instructorGPA = instructorGPA;
    }


    /**
     * @return the courseGPA
     */
    public String getCourseGPA() {
        return courseGPA;
    }


    /**
     * @param courseGPA
     *            the courseGPA to set
     */
    public void setCourseGPA(String courseGPA) {
        this.courseGPA = courseGPA;
    }


    /**
     * @return the as
     */
    public String getAs() {
        return As;
    }


    /**
     * @param as
     *            the as to set
     */
    public void setAs(String as) {
        As = as;
    }


    /**
     * @return the bs
     */
    public String getBs() {
        return Bs;
    }


    /**
     * @param bs
     *            the bs to set
     */
    public void setBs(String bs) {
        Bs = bs;
    }


    /**
     * @return the cs
     */
    public String getCs() {
        return Cs;
    }


    /**
     * @param cs
     *            the cs to set
     */
    public void setCs(String cs) {
        Cs = cs;
    }


    /**
     * @return the ds
     */
    public String getDs() {
        return Ds;
    }


    /**
     * @param ds
     *            the ds to set
     */
    public void setDs(String ds) {
        Ds = ds;
    }


    /**
     * @return the fs
     */
    public String getFs() {
        return Fs;
    }


    /**
     * @param fs
     *            the fs to set
     */
    public void setFs(String fs) {
        Fs = fs;
    }


    /**
     * @return the ws
     */
    public String getWs() {
        return Ws;
    }


    /**
     * @param ws
     *            the ws to set
     */
    public void setWs(String ws) {
        Ws = ws;
    }


    /**
     * returns string
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Data for " + department + courseNumber + " for "
            + instructor + ": \n");
        builder.append("As: " + getAs() + " Bs: " + getBs() + " Cs: " + getCs()
            + " Ds: " + getDs() + " Fs: " + getFs() + " Ws: " + getWs() + "\n");
        builder.append("Instructor's GPA: (0.0 if new) " + getInstructorGPA()
            + "\n");
        builder.append("Overall course GPA: " + getCourseGPA());
        return builder.toString();
    }
}
