package com.javacoban.studentmanagement;

import java.util.ArrayList;


public class StudentManagement {
    private  ArrayList<Student> studentList = new ArrayList<>();

    public ArrayList<Student> getList() {
        return studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudent(Student student){
        studentList.remove(student);
    }

    public Student searchByID(int ID) {
        for (Student student: studentList) {
            if( student.getID() == ID) {
                return student;
            }
        }
        return null;
    }
    public Student searchByName(String name){
        for (Student student1 : studentList){
            if(student1.getName().equalsIgnoreCase(name)){
                return student1;
            }
        }
        return null;
    }
}