package com.kahol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Sun {                     // stuff u need
    Scanner sc = new Scanner(System.in);

    List<Tutor> tutor = new ArrayList<>();
    List<Enroll> enroll= new ArrayList<>();

    public  void applyForTutor(){
        Tutor tut = new Tutor();

        System.out.print("\nEnter your name :");
        tut.name=sc.nextLine();
        System.out.print("Course Offering :");
        tut.courseOffering=sc.nextLine();
        System.out.print("Qualification(if student also mention batch) :");
        tut.qualification=sc.nextLine();
        System.out.print("Venue :");
        tut.venue=sc.nextLine();
        System.out.print("Timing :");
        tut.timing=sc.nextLine();
        System.out.print("Course length :");
        tut.courseLength=sc.nextLine();
        System.out.print("Set Course Price :");
        tut.coursePrice=sc.nextLine();
        System.out.println("\n\tSuccessfully submitted!!!\n\n");

        if(!tutor.contains(tut)) {
            tutor.add(tut);
        }
    }
    public void availableCourses(){
        System.out.println(tutor);
    }
    public void enrolledStudent(){
        System.out.println(enroll);
    }
    public  void joinCourse(){
        Enroll en = new Enroll();
        System.out.print("\nEnter your details and course details you want to enroll in :");
        System.out.print("\nEnter your name :");
        en.name=sc.nextLine();
        System.out.print("Enter your email ID :");
        en.emailD=sc.nextLine();
        System.out.print("Enter course name :");
        en.course=sc.nextLine();
        System.out.print("Enter tutor name :");
        en.tutorName=sc.nextLine();
        System.out.println("\n\tYour details are successfully submitted"+
                        "\n\t****You will be notified soon****\n");
        enroll.add(en);
    }
    public  void sellBooksAndNotes(){

    }
    public  void purchaseBooksAndNotes(){

    }
}
