package com.javacoban.oop;

public class Worker extends Employee{
    private String factory;


    public Worker(String name, String gender, String dateofbirth, String address, String factory){
        super(name, gender, dateofbirth, address);
        this.factory = factory;
    }


    public Worker(){

    }


    public String getFactory() {
        return factory;
    }


    public void setFactory(String factory) {
        this.factory = factory;
    }
}
