package com.vtgpa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Reader class that will store all course data from csv
 * @author Pranav Chavvakula
 * @version Jan 31, 2020
 */
public class DataReader {
    //private fields
    private ArrayList<Course> courses;
    
    /**
     * Constructor
     * @param fileName
     * @throws FileNotFoundException
     */
    public DataReader(String fileName) 
        throws FileNotFoundException {
        courses = generateGradeData(fileName);
    }
    
    /**
     * Parser
     * @param fileName
     * @return
     * @throws FileNotFoundException
     */
    private ArrayList<Course> generateGradeData(String fileName) 
        throws FileNotFoundException
    {
        ArrayList<Course> courses = new ArrayList<Course>();
        
        Scanner scanner = new Scanner(new File(fileName));
        scanner.nextLine();

        while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        line = line.replace("\"", "");
        String[] data = line.split(",");
        Course temp = new Course(
            data[0],
            data[1],
            data[2],
            data[3],
            data[5],
            data[6],
            data[7],
            data[8],
            data[9],
            data[10],
            data[11],
            data[12],
            data[14]);
        courses.add(temp); 
        }
           
        scanner.close();
        return courses;
    }
    
    /**
     * @return the courses
     */
    public ArrayList<Course> getCourses() {
        return courses;
    }

}

