package com.kahol;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Scanner;

public class Main {

    public static void printInstructions(){
        System.out.println("Press :");
        System.out.println("\t0 - To print instructions");
        System.out.println("\t1 - To offer a course");      // tutor
        System.out.println("\t2 - Available Courses");
        System.out.println("\t3 - To join a course");
        System.out.println("\t4 - To sell second-hand books/notes");
        System.out.println("\t5 - To purchase second-hand books/notes");
        System.out.println("\t6 - Enrolled student details");
        System.out.println("\t7 - To exit\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sun sun=new Sun();
        boolean isQuit = false;
        System.out.println("*************************************************************");
        System.out.println("\n\t\tWelcome to TUTOR_CONSOLE_APPLICATION");
        printInstructions();
        while(!isQuit) {
            System.out.print("\nEnter your choice :");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    sun.applyForTutor();
                    break;
                case 2:
                    sun.availableCourses();
                    break;
                case 3:
                    sun.joinCourse();
                    break;
                case 4:
                    sun.sellBooksAndNotes();
                    break;
                case 5:
                    sun.purchaseBooksAndNotes();
                    break;
                case 6:
                    sun.enrolledStudent();
                    break;
                case 7:
                    isQuit = true;
                    break;
            }
        }
    }

}
