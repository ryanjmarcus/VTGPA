package com.vtgpa;

//test

public class Course {
    // private fields
    private String year;
    private String term;
    private String subject;
    private String courseNum;
    private String instructor;
    private String avgGPA;
    private String avgAs;
    private String avgBs;
    private String avgCs;
    private String avgDs;
    private String avgFs;
    private String withdraws;
    private String credits;
    
    /**
     * Constructor for course
     * @param year
     * @param term
     * @param subject
     * @param courseNum
     * @param instructor
     * @param avgGPA
     * @param avgAs
     * @param avgBs
     * @param avgCs
     * @param avgDs
     * @param avgFs
     * @param withdraws
     * @param credits
     */
    public Course(String year, String term, String subject, String courseNum,
        String instructor, String avgGPA, String avgAs, String avgBs, String avgCs,
        String avgDs, String avgFs, String withdraws, String credits) {
        this.year = year;
        this.term = term;
        this.subject = subject;
        this.courseNum = courseNum;
        this.instructor = instructor;
        this.avgGPA = avgGPA;
        this.avgAs = avgAs;
        this.avgBs = avgBs;
        this.avgCs = avgCs;
        this.avgDs = avgDs;
        this.avgFs = avgFs;
        this.withdraws = withdraws;
        this.credits = credits;
    }
    
   
    
    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }



    /**
     * @return the term
     */
    public String getTerm() {
        return term;
    }



    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }



    /**
     * @return the courseNum
     */
    public String getCourseNum() {
        return courseNum;
    }



    /**
     * @return the instructor
     */
    public String getInstructor() {
        return instructor;
    }



    /**
     * @return the avgGPA
     */
    public String getAvgGPA() {
        return avgGPA;
    }



    /**
     * @return the avgAs
     */
    public String getAvgAs() {
        return avgAs;
    }



    /**
     * @return the avgBs
     */
    public String getAvgBs() {
        return avgBs;
    }



    /**
     * @return the avgCs
     */
    public String getAvgCs() {
        return avgCs;
    }



    /**
     * @return the avgDs
     */
    public String getAvgDs() {
        return avgDs;
    }



    /**
     * @return the avgFs
     */
    public String getAvgFs() {
        return avgFs;
    }



    /**
     * @return the withdraws
     */
    public String getWithdraws() {
        return withdraws;
    }



    /**
     * @return the credits
     */
    public String getCredits() {
        return credits;
    }

    /**
     * 
     */
    @Override
    public String toString()
    {
        StringBuilder str = new StringBuilder();
        str.append("Year " + year);
        str.append(" Term " + term);
        str.append(" Subject " + subject);
        str.append(" Course Number " + courseNum);
        str.append(" Instructor " + instructor);
        str.append(" avg GPA " + avgGPA);
        str.append(" As: " + avgAs);
        str.append(" Bs: " + avgBs);
        str.append(" Cs: " + avgCs);
        str.append(" Ds: " + avgDs);
        str.append(" Fs: " + avgFs);
        str.append(" Withdraws: " + withdraws);
        str.append(" Credits " + credits);
        
        return str.toString();
    }

    

}
