package com.kahol;

public class Tutor {
    String name;
    String qualification;
    String courseOffering;
    String venue;
    String timing;
    String courseLength;
    String coursePrice;

    public String getName() {
        return name;
    }

    public String getQualification() {
        return qualification;
    }

    public String getCourseOffering() {
        return courseOffering;
    }

    public String getVenue() {
        return venue;
    }

    public String getCourseLength() {
        return courseLength;
    }

    public String getTiming() {
        return timing;
    }

    public String getCoursePrice() {
        return coursePrice;
    }
    public String toString(){
        String str= "\nInstructor name :"+getName()+"\n" +
                "Qualification :"+getQualification()+"\n" +
                "Course Offering :"+getCourseOffering()+"\n"+
                "Venue :"+getVenue()+"\n" +
                "Course length :"+getCourseLength()+"\n" +
                "Timing :"+getTiming()+"\n" +
                "Course price :"+getCoursePrice()+"\n" ;
        return str;
    }
}
