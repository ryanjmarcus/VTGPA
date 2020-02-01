package com.vtgpa;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataProcessor {
    // Instance of DataReader
    private DataReader reader;
    private ArrayList<Course> courses;


    /**
     * DataProcessor Constructor that has GradeData
     * 
     * @throws IOException
     */
    public DataProcessor() throws IOException {
        reader = new DataReader("GradeData.csv");
        courses = reader.getCourses();
        System.out.println("Ready!");
    }


    /**
     * Get GPA
     * 
     * @param instructor
     * @param num
     * @param dep
     * @return
     */
    
    @RequestMapping("{subject}/{courseNum}/{instructor}")
    public ReturnData getGPA(@PathVariable("subject")String subject, @PathVariable("courseNum")String courseNum, @PathVariable("instructor")String instructor) {
        ArrayList<Course> allList = new ArrayList<Course>();
        for (int i = 0; i < courses.size(); i++) {
            Course tempCourse = courses.get(i);
            if ((tempCourse.getSubject().equals(subject)) && (tempCourse
                .getCourseNum().equals(courseNum))) {
                allList.add(tempCourse);
            }
        }

        ArrayList<Course> instructList = new ArrayList<Course>();
        for (int i = 0; i < courses.size(); i++) {
            Course tempCourse = courses.get(i);
            // System.out.println(tempCourse.getInstructor());
            if (instructor.equalsIgnoreCase(tempCourse.getInstructor()) && courseNum
                .equalsIgnoreCase(tempCourse.getCourseNum()) && subject
                    .equalsIgnoreCase(tempCourse.getSubject())) {
                instructList.add(tempCourse);
            }
        }
        ReturnData retData = new ReturnData();
        retData.setNumber(courseNum);
        retData.setDepartment(subject);
        retData.setInstructor(instructor);
        if (instructList.size() == 0) {
        	if (allList.size() == 0) {
        		retData.setInstructorGPA("0.0");
        		retData.setCourseGPA("0.0");
        		
        	}
        	else {
        		retData.setInstructorGPA("0.0");
                retData.setCourseGPA(Double.toString(getAvgGpa(allList)));
                setLetters(retData, allList);
        	}
            
        }
        else {
            retData.setInstructorGPA(Double.toString(getAvgGpa(instructList)));
            retData.setCourseGPA(Double.toString(getAvgGpa(allList)));
            setLetters(retData, instructList);
        }
        return retData;
    }
    
    
    @RequestMapping("test/{subject}/{courseNum}/{instructor}")
    public String getGPAOnly(@PathVariable("subject")String subject, @PathVariable("courseNum")String courseNum, @PathVariable("instructor")String instructor) {
    	
    	ReturnData data = getGPA(subject, courseNum, instructor);
    	
    	if (data.getInstructorGPA().equals("0.0")) {
    		System.out.println(data.getCourseGPA() + " " + data.getCourseNumber());
    		return data.getCourseGPA();
    	}
    	else {
    		return data.getInstructorGPA();
    	}
    	
    }
    	
  


    /**
     * 
     * @param ret
     * @param theCourses
     */
    private void setLetters(ReturnData retData, ArrayList<Course> temp) {
        Course individualCourse;
        Double avgA = 0.0;
        Double avgB = 0.0;
        Double avgC = 0.0;
        Double avgD = 0.0;
        Double avgF = 0.0;
        Integer avgW = 0;
        for (int j = 0; j < temp.size(); j++) {
            individualCourse = temp.get(j);
            avgA = avgA + Double.parseDouble(individualCourse.getAvgAs());
            avgB = avgB + Double.parseDouble(individualCourse.getAvgBs());
            avgC = avgC + Double.parseDouble(individualCourse.getAvgCs());
            avgD = avgD + Double.parseDouble(individualCourse.getAvgDs());
            avgF = avgF + Double.parseDouble(individualCourse.getAvgFs());
            avgW = avgW + Integer.parseInt(individualCourse.getWithdraws());
        }
        avgA = avgA / temp.size();
        avgB = avgB / temp.size();
        avgC = avgC / temp.size();
        avgD = avgD / temp.size();
        avgF = avgF / temp.size();
        avgW = avgW / temp.size();
        Double newA = (Math.round(avgA * 10.0) / 10.0);
        Double newB = (Math.round(avgB * 10.0) / 10.0);
        Double newC = (Math.round(avgC * 10.0) / 10.0);
        Double newD = (Math.round(avgD * 10.0) / 10.0);
        Double newF = (Math.round(avgF * 10.0) / 10.0);
        retData.setAs(newA.toString());
        retData.setBs(newB.toString());
        retData.setCs(newC.toString());
        retData.setDs(newD.toString());
        retData.setFs(newF.toString());
        retData.setWs(avgW.toString());
    }


    /**
     * 
     * @param list
     * @return
     */
    private double getAvgGpa(ArrayList<Course> list) {
        double result = 0.0;
        Course temp = null;
        for (int j = 0; j < list.size(); j++) {
            temp = list.get(j);
            double gpa = (double)Double.parseDouble(temp.getAvgGPA());
            result = result + gpa;

        }
        return Math.floor((result / list.size()) * 100) / 100;
    }
}
