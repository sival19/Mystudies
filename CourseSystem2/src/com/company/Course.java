package com.company;

public class Course {
    public String name;
    public Student[] participants;
    public int studentCount = 0;

    public void enroll(Student std) {
        participants[studentCount] = std;
        studentCount++;

    }

    public void remove(Student std)
    {
        for (int i = 0; i < studentCount; i++)
        {
            if(participants[i].id == std.id)
            {
                studentCount--;
                if (i == studentCount)
                {
                    participants[i]=null;
                }
                else
                {
                    for (int j = i+1 ; j<=studentCount; j++)
                    {
                        participants[j-1]=participants[j];
                    }
                }
            }
        }
    }

    public Student[] getParticipants()
    {
        Student[] stds = new Student[studentCount];
        for(int i = 0  ; i< studentCount; i++)
        {
            stds[i]=participants[i];
        }
        return stds;
    }
}
