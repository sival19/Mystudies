package com.company;

public class EnrollmentSystem {
    public Student[] students;
    public Course[] courses;

    public void enroll(Student std , Course crs)
    {
        crs.enroll(std);
    }

    public void remove(Student std, Course crs)
    {
        crs.remove(std);
    }

    public void showParticipants(Course crs)
    {
        Student[] stds = crs.getParticipants();
        for(int i=0; i< stds.length ; i++)
        {
            System.out.println(stds[i].getName());
        }
    }

    public void getCourses()
    {
        for(int i=0 ; i< courses.length; i++)
        {
            System.out.println(courses[i].name);
        }
    }

    public void getStudents()
    {
        for(int i=0; i< students.length ; i++)
        {
            System.out.println(students[i].getName());
        }
    }
}

