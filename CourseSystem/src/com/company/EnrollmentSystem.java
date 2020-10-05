package com.company;

public class EnrollmentSystem {
    private Student[] students;
    private Course[] courses;

    public EnrollmentSystem() {
        students = new Student[100];
        courses = new Course[100];

    }

    public void enroll(Student student, Course course) {
        course.enroll(student);
    }

    public void remove(Student student, Course course) {
        course.remove(student);
    }

    public void showParticipants(Course course) {
        for (Student student : course.getParticipants()) {
            System.out.println(student.getName());
        }
    }

    //add a student
    public void addStudent(Student std) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = std;
                return;
            }
        }


    }

    //remove a student
    public void removeStudent(Student std) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == std) {
                students[i] = null;
            }
        }
    }

    //add a course
    public void addCourse(Course crs) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = crs;
                return;
            }
        }


    }

    //remove a course
    public void removeCourse(Course crs) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == crs) {
                courses[i] = null;
            }
        }
    }

   /*
   public Course[] getCourses(Course crs)
    {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == crs) {
                courses[i] = null;
            }

        }
        return courses;
    }

    */

    public Student[] getStudents(Student std)
    {
        for (int i = 0; i < courses.length; i++) {
            if (students[i] == std) {
                students[i] = null;
            }

        }
        return students.clone();
    }


    /*public void getCourses() {
        System.out.println("void for a getter?");
    }

    public void getStudents() {
        System.out.println("void for a getter?");
    }
    */
}
