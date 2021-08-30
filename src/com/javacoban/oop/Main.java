package com.javacoban.oop;

public  class Main {
    public static void main(String[] args) {
        Employee sao = new Employee();
        sao.setName("DO THI SAO");
        sao.setDateofbirth("07/03/2002");
        sao.setAddress("Hai Duong");
        sao.setGender("nu");

        String name = sao.getName();
        String dateofbirth = sao.getDateofbirth();
        String address = sao.getAddress();
        String gender = sao.getGender();
        System.out.println("name: " + name);
        System.out.println("date of birth: " + dateofbirth);
        System.out.println("address: " + address);
        System.out.println("gender: " + gender);
    }
}



