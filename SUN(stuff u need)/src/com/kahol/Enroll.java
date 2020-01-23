package com.kahol;

public class Enroll {
    String name;
    String emailD;
    String tutorName;
    String course;

    public String getName() {
        return name;
    }

    public String getEmailD() {
        return emailD;
    }

    public String getTutorName() {
        return tutorName;
    }

    public String getCourse() {
        return course;
    }

    public String toString(){
        String str="\nCourse :"+getCourse()+"\n" +
                "Tutor name :"+getTutorName()+"\n" +
                "Enroll's Name :"+getName()+"\n"+
                "Email ID :"+getEmailD()+"\n" ;
        return str;
    }
}
