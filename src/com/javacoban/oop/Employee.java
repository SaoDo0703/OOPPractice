package com.javacoban.oop;

public class Employee {
    private String name;
    private String gender;
    private String dateofbirth;
    private String address;

    public Employee(String name, String gender, String dateofbirth, String address) {
        this.name = name;
        this.gender = gender;
        this.dateofbirth = dateofbirth;
        this.address = address;
    }

    public Employee(){

    }

    public String getName(){

        return name;
    }


    public void setName(String name) {

        this.name = name;
    }


    public String getGender(){

        return gender;
    }


    public void setGender(String gender) {

        this.gender = gender;
    }


    public String getDateofbirth(){

        return dateofbirth;
    }


    public void setDateofbirth(String dateofbirth) {

        this.dateofbirth = dateofbirth;
    }



    public String getAddress(){

        return address;
    }



    public void setAddress(String address) {

        this.address = address;
    }
}


