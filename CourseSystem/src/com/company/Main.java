package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


       Student std = new Student("Preben", 1);
       Course crs = new Course("OOP");



        EnrollmentSystem newStd = new EnrollmentSystem();
        EnrollmentSystem newCourse = new EnrollmentSystem();

        newStd.enroll(std , crs);

        //newCourse.addCourse(crs);

        //newStd.addStudent(std);
        
        //System.out.println(Arrays.toString(newCourse.getCourses(crs)));
        //System.out.println(Arrays.toString((newStd.getStudents(std))));

       // System.out.println(Arrays.toString(crs.getParticipants()));
        

        //System.out.println(std.getName());




    }
}
