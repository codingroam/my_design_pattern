package com.company.prototype.deepclone;

import java.io.*;

public class Student implements Serializable{

    private String name;
    private int age;
    private Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, Book book) {
        this.name = name;
        this.age = age;
        this.book = book;
    }


    public Student deepClone() {

        try {
            //将对象写入流
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bao);
            oos.writeObject(this);


            //将对象从流中取出
            ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (Student)ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
