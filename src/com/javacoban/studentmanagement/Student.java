package com.javacoban.studentmanagement;

public class Student {
    private int ID;
    private String name;
    private String major;
    private float theoryScore;
    private float practiceScore;

    public Student(int ID, String name, String major, float theoryScore, float practiceScore) {
        this.ID = ID;
        this.name = name;
        this.major = major;
        this.theoryScore = theoryScore;
        this.practiceScore = practiceScore;
    }

    public void Student(){

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getTheoryScore() {
        return theoryScore;
    }

    public void setTheoryScore(float theoryScore) {
        this.theoryScore = theoryScore;
    }

    public float getPraticeScore() {
        return practiceScore;
    }

    public void setPraticeScore(float praticeScore) {
        this.practiceScore = praticeScore;
    }

    public float canculateAverageScore(){
        return (getTheoryScore()+ getPraticeScore())/2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID = " + ID +
                ", Name = " + name  +
                ", Major= " + major +
                ", TheoryScore = " + theoryScore +
                ", PraticeScore =" + practiceScore +
                ", Average Score ="+ canculateAverageScore()+
                '}';
    }
}