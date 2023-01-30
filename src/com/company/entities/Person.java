package com.company.entities;

public class Person {
    private String Name ;
    private String sex;
    private int age;
    private int telefon;


    public Person(String Name , String sex, int age, int telefon){
        this.Name=Name;
        this.sex=sex;
        this.age=age;
        this.telefon=telefon;
    }


    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", telefon=" + telefon +
                '}';
    }
}


