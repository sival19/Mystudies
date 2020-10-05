package com.company;

public class Course {
    private String name;
    private Student[] participants = new Student[5];
    private int id;

    Course(String name) {
        this.name = name;
        this.participants = new Student[participants.length];
    }

    public void enroll(Student student) {
        for (int i = 0; i < participants.length; i++) {
            if (participants[i] == null) {
                participants[i] = student;
                return;
            }
        }
    }

    public void remove(Student student) {
        for (int i = 0; i < participants.length; i++) {
            if (participants[i] == student) {
                participants[i] = null;
            }
        }
    }
    

    public Student[] getParticipants() {
// count number of entries
        int count = 0;
        for (Student student : participants) {
            if (student != null) {
                count++;
            }
        }
// make a copy
        Student[] result = new Student[count];
        for (Student student : participants) {
            if (student != null) {
                result[count--] = student;
            }
        }
        return result;
    }
}