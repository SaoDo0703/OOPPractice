package com.javacoban.oop;

public class Officer extends Employee{
    private String department;
    private int level;

    public Officer(String name, String gender, String dateofbirth, String address, String department,int level){
        super(name, gender, dateofbirth, address);
        this.department = department;
        this.level = level;
        }


        public Officer(){

        }


        public String getDepartment() {
        return department;
        }


        public int getLevel() {
        return level;
        }



        public void setDepartment(String department) {
        this.department = department;
        }



        public void setLevel(int level) {
        this.level = level;
        }
    }