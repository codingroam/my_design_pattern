package com.company.prototype.javaclone;

public class Student implements Cloneable{

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

    @Override
    protected Student clone() throws CloneNotSupportedException {
        Student ss =  (Student)super.clone();
        Book bookClone = ss.getBook().clone();
        ss.setBook(bookClone);
        return ss;
    }
}
