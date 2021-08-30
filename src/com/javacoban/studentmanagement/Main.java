package com.javacoban.studentmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement studentManagement = new StudentManagement();
        ArrayList<Student> studentsList = studentManagement.getList();
        showMenu();
        while (true) {
            System.out.println("Enter Choose");
            int number = scanner.nextInt();
            scanner.nextLine();
            switch (number) {
                case 1:
                    Student student = inputInfor();
                    studentManagement.addStudent(student);
                    break;

                case 2:
                        System.out.println("Enter ID of the student you want to removed: ");
                        int removeID = scanner.nextInt();
                        Student one = studentManagement.searchByID(removeID);
                        if ( one == null ) {
                            break;
                        }
                            studentManagement.removeStudent(one);
                            System.out.println("Delete!");
                            break;

                case 3:
                    System.out.println("Enter ID You Need Search");
                    int inputID = scanner.nextInt();
                    Student student1 = studentManagement.searchByID(inputID);
                    if(student1 == null){
                        System.out.println("Not Found ID You Need");
                        }else{
                        display(student1);
                    }
                    break;

                case 4:
                    System.out.println("Enter Student Name You Want To Search");
                    String inputName = scanner.nextLine();
                     Student student2 = studentManagement.searchByName(inputName);
                        if(student2 == null){
                            System.out.println("Not Found Name");
                        } else{
                            display(student2);
                        }
                    break;
                case 5:
                    for(Student st: studentsList){
                        display(st);
                    }
                    break;

                case 6:
                    showMenu();
                    break;

                case 7:
                    System.out.println("GoodBye~~");
                    return;

                default:
                    System.err.println("Enter Again");
            }
        }
    }

    public static void showMenu() {
        System.out.println("Welcome to the class");
        System.out.println("Please choose an action: ");
        System.out.println("1. Add Student");
        System.out.println("2. Delete Student");
        System.out.println("3. Search Student Based On ID");
        System.out.println("4. Search Student Based On Name");
        System.out.println("5. Display all");
        System.out.println("6. Show menu");
        System.out.println("7. Exist");
    }

    public static Student inputInfor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input infor of a student: ");
        System.out.print(" ID: ");
        int ID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.println("Major: ");
        String major = scanner.nextLine();
        System.out.println("Theory score: ");
        float theoryScore = scanner.nextFloat();
        System.out.println("Practice score: ");
        float practiceScore = scanner.nextFloat();
        return new Student(ID,name,major,theoryScore,practiceScore);
    }
    public static void display(Student student) {
        System.out.println(student.toString());
    }
}


